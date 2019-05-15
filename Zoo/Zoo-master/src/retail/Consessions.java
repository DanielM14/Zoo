package retail;
import money.Wallet;

import java.util.Scanner;

public class Consessions {
    public static void displayMenu(){
        int choice;
        int pop = -3;
        int hotDog = -4;
        int popcorn = -1;
        int candyBar = -2;
        int chickFilA = -8;
        Scanner input = new Scanner(System.in);

        m("Welcome to the concession stand where we hose you on our prices.");
        m("What would you like to order?");
        m("1) Pop $3");
        m("2) Hot Dog $4");
        m("3) Popcorn $1");
        m("4) Candy Bar $2");
        m("5) Chick fil a $8 ");

        choice = input.nextInt();

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Wallet wallet3 = new Wallet();
        Wallet wallet4 = new Wallet();
        Wallet wallet5 = new Wallet();

        switch (choice){
            case  1:
                //Subract from wallet here
                wallet1.setWallet(pop);
                break;
            case 2:
                //Subract from wallet here
                wallet2.setWallet(hotDog);
                break;
            case 3:
                //subtract from wallet
                wallet3.setWallet(popcorn);
                break;
            case 4:
                wallet4.setWallet(candyBar);
                break;
            case 5:
                wallet5.setWallet(chickFilA);
            default:
                m("That option does not exist");
        }

    }

    public static void m(String m){
        System.out.println(m);
    }
}
