package com.teachmeskiils.lesson10.task0.service;

import com.teachmeskiils.lesson10.task0.model.card.Card;

public class SameCard {

    public static void showNumberIdenticalCards(Card[] cards){
        boolean same = false;
        int duplicate = 0;
        for(int i = 0; i < cards.length; i++) {
            int result = 1;
            if (cards[i] != null) {
                for (int j = i + 1; j < cards.length; j++) {
                    int counter = 0;
                    if (cards[i].equals(cards[j])) {
                        same = true;
                        counter++;
                        cards[j] = null;
                        result += counter;
                    }
                }
            } else {
                break;
            }
            if(same){
                System.out.println("Card " + (i+1) + " have repeats itself: " + result + " times");
                duplicate++;
            }
        }
        if(duplicate == 0){
            System.out.println("Уou have no duplicate cards");
        } else {
            System.out.println("Уou have "+ duplicate +" repetitive");
        }
    }

}
