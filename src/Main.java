
import Data.Inventory;
import Data.MemberRegistry;
import Member.Member;
import Rental.Rental;
import Rental.RentalService;
import Member.MembershipService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberRegistry memberreg = new MemberRegistry();
        memberreg.loadMemberData();
        MembershipService membershipService = new MembershipService(memberreg);
        Inventory inventory = new Inventory();
        inventory.loadDatabase();
        RentalService rentalService = new RentalService(inventory, memberreg);
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nWigells medlemsklubb");
            System.out.println("Skriv in en siffra för:");
            System.out.println("1 för lagerstatus");
            System.out.println("2 för medlemmar");
            System.out.println("3 för lägga till medlemmar");
            System.out.println("4 för att ändra medlem på id");
            System.out.println("5 för att starta hyrning");
            System.out.println("6 för att avsluta hyrning");
            System.out.println("7 för att kolla aktuella uthyrningar");
            System.out.println("8 för att kolla intäkter");
            System.out.println("9 för att kolla historik per medlem");
            System.out.println("0 för att stänga");
            int val = myObj.nextInt();
                switch (val){
                    case 1:
                        System.out.println("\nNuvarande Lager");
                        inventory.getAllItems().forEach(System.out::println);
                        break;

                    case 2:
                        System.out.println("\nNuvarande medlemmar:");
                        for (Member m : membershipService.getAllMembers())
                            System.out.println(" " + m.getId() + ": " + m.getName() + " - " + m.getLevel());
                        break;

                    case 3:
                        System.out.println("\nLägga till användare");
                        System.out.println("Skriv in namnet");
                        String nametemp = myObj.next();
                        System.out.println("Skriv in vilken prisnivå den ska ha");
                        String leveltemp = myObj.next();
                        membershipService.addMember(nametemp,leveltemp);
                        break;

                    case 4:
                        System.out.println("\nSkriv in ID du vill ändra");
                        int id = myObj.nextInt();
                        Member m = membershipService.findById(id);
                        if (m == null) {
                            System.out.println("Ingen medlem med det ID finns");
                            break;
                        }
                        System.out.println("Du ändrar " + m.getName() + " " + m.getLevel());
                        System.out.println("Ange nytt namn");
                        String newName = myObj.next();
                        System.out.println("Ange prisnivå");
                        String newLevel = myObj.next();
                        Member updatedMember = membershipService.changeMember(id, newName, newLevel);
                        System.out.println("Ändrad till " + updatedMember.getName() + " " + updatedMember.getLevel());
                        break;

                    case 5:
                        System.out.println("Välj vad som ska hyras");
                        inventory.getAllItems().forEach(System.out::println);
                        int val1 = myObj.nextInt();
                        System.out.println("Välj vem som ska hyra");
                        for (Member m1 : membershipService.getAllMembers())
                            System.out.println(" " + m1.getId() + ": " + m1.getName() + " - " + m1.getLevel());
                        int val2 = myObj.nextInt();
                        System.out.println("Välj hur många dagar du ska hyra");
                        int val3 = myObj.nextInt();
                        boolean check = rentalService.startRental(val2, val1, val3);
                        if (check) {
                            System.out.println("Hyrnigen har startats");
                        }else{
                            System.out.println("Kunde inte starta bokningen");
                        }
                        break;

                    case 6:
                        System.out.println("Välj vilken uthyrning som ska avslutas");
                        for (Rental rental : rentalService.getRentalList()) {
                            System.out.println(rental.getItem() + " hyrd av " + rental.getMember());
                        }
                        int val4 = myObj.nextInt();
                        boolean check1 = rentalService.endRental(val4);
                        if (check1) {
                            System.out.println("Hyrningen har avslutats");
                        }else{
                            System.out.println("Hyrningen kunde inte avslutas");
                        }
                        break;

                    case 7:
                        System.out.println("Aktuella uthyrningar");
                        for (Rental rental : rentalService.getRentalList()) {
                            System.out.println(rental.getItem() + " hyrd av " + rental.getMember());
                        }
                        break;

                    case 8:
                        System.out.println("Totala intäkter");
                        System.out.println(rentalService.getSum());
                        break;

                    case 9:
                        System.out.println("\nMedlemmar:");
                        for (Member m2 : membershipService.getAllMembers())
                            System.out.println(" " + m2.getId() + ": " + m2.getName() + " - " + m2.getLevel());
                        System.out.println("Skriv in ID på medlem");
                        int val5 = myObj.nextInt();
                        Member m2 = membershipService.findById(val5);
                        m2.getRentalHistory().forEach(System.out::println);
                        break;

                    case 0:
                        System.out.println("Stänger");
                        System.exit(0);

                    default:
                        System.out.println("Fel inmatning");
                        break;
                }
            }
        }
    }
