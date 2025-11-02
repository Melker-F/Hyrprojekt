
import Data.Inventory;
import Member.Member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();
        Member member4 = new Member();
        Member member5 = new Member();
        Member member6 = new Member();
        Inventory inventory = new Inventory();
        inventory.loadDatabase();
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nVälkommen till test");
            System.out.println("Skriv in en siffra för:");
            System.out.println("1 för lagerstatus");
            System.out.println("0 för att stänga");
            int val = myObj.nextInt();

            if (val >= 1 && val <= 1){
                switch (val){
                    case 1:
                        System.out.println(inventory);
                        break;

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