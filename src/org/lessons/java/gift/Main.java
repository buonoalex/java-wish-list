package org.lessons.java.gift;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Apro il mio Scanner
        Scanner myBroScan = new Scanner(System.in);

        Set<String> myGiftList = new HashSet<>();

        boolean sentinella = false;
        System.out.println("Benvenuto nella tua lista personale!!!");

        try {
            while (!sentinella){
                System.out.println("Vuoi aggiungere un regalo (y/n) : ");
                String selectionMenu = myBroScan.nextLine();
                switch (selectionMenu) {
                    case "y":
                        System.out.println("Inserisci il nome del regalo : ");
                        String nameGift = myBroScan.nextLine();
                        boolean added = myGiftList.add(nameGift);
                        if (!added) {
                            System.out.println("Il regalo è gia stato inserito");
                        }

                        break;
                    case "n":
                        System.out.println("OK grazie arrivederci.");
                        sentinella = true;
                        break;
                    default:
                        System.out.println("type non valid try again");
                        break;
                }
                System.out.println(myGiftList.size());
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {

            //Stampo Regali
            for (String element : myGiftList){
                System.out.println(element);
            }

            //Chiudo Scan
            myBroScan.close();

        }

    }
}
