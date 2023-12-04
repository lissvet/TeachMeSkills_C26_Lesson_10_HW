package com.teachmeskiils.lesson10.task0.service;

import com.teachmeskiils.lesson10.task0.model.card.Card;

import java.util.Scanner;

public class ArrayOfCard {

    public static Card[] createArrayCard(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many cards you have:");
        int cards = scan.nextInt();
        scan.nextLine();
        if(cards < 0){
            return new Card[0];
        } else {
            Card[] clientCards = new Card[cards];
            int k = 1;
            for (int i = 0; i < clientCards.length; i++) {
                Card card1 = new Card();
                clientCards[i] = card1;
                System.out.println("Enter CVV (three digit number) card" + k + ": ");
                card1.setCvv(scan.nextInt());
                scan.nextLine();
                System.out.println("Enter card" + k + " number: ");
                card1.setCardNumber(scan.nextLong());
                scan.nextLine();
                System.out.println("Enter amount on card" + k + " : ");
                card1.setCardAmount(scan.nextInt());
                scan.nextLine();
                k++;
            }
            return clientCards;
        }
    }

}
