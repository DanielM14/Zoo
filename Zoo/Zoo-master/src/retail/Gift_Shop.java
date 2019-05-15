package retail;
import money.Wallet;

import java.util.Scanner;

public class Gift_Shop {
    public static void displayGiftShopMenu(){
        int choice;
        int stuffedParret = -20;
        int stuffedAlligator = -20;
        int stuffedChimpanzee = -20;
        int stuffedOrangutan = -20;
        int stuffedZebra = -20;
        int stuffedRingTailedLemure = -20;

        Scanner input =  new scanner(System.in);

        m("Welcome to the Zoo's gift shop!!!");
        m("What do you want to buy??");
        m("1) Stuffed Parret ");
        m("2) Stuffed Alligator");
        m("3) Stuffed Chimpanzee");
        m("4) Stuffed Orangutan");
        m("5) Stuffed Zebra");
        m("6) Stuffed Ring Taile dLemure");

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
