
import Data.Inventory;
import Data.MemberRegistry;
import Member.Member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberRegistry memberreg = new MemberRegistry();
        memberreg.loadMemberData();
        Inventory inventory = new Inventory();
        inventory.loadDatabase();
        int i = 0;
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nVälkommen till test");
            System.out.println("Skriv in en siffra för:");
            System.out.println("1 för lagerstatus");
            System.out.println("2 för medlemmar");
            System.out.println("3 för att modifiera");
            System.out.println("0 för att stänga");
            int val = myObj.nextInt();

            if (val >= 1 && val <= 3){
                switch (val){
                    case 1:
                        System.out.println("\n" + inventory);
                        break;

                    case 2:
                        System.out.print("\n");
                        System.out.println("Nuvarande medlemmar:");
                        for (i = 0; i < 6; i++)
                        System.out.println(" " + memberreg.getMemberreg().get(i).getName() + " " + memberreg.getMemberreg().get(i).getLevel());
                        break;

                    case 3:
                        System.out.println("Modifiera användare");
                        System.out.println("Skriv in vilken som ska modifieras");
                        break;

                    //case
                    //case
                }
            } else{
                if (val == 0){
                    System.out.println("Stänger");
                    System.exit(0);
                } else{
                    System.out.println("Fel inmatning");
                }
            }
        }
    }
}