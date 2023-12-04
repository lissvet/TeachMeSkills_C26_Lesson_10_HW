package com.teachmeskiils.lesson10.task0;

import com.teachmeskiils.lesson10.task0.model.client.Client;
import com.teachmeskiils.lesson10.task0.service.ArrayOfCard;
import com.teachmeskiils.lesson10.task0.service.SameCard;
/**
 * Create a client.
 * A client can have any number of cards.
 * A card has three fields: cvv code, card number and amount on the card.
 * Display a message about how many identical cards the client has.
 * The field describing the amount on the card should not participate in the comparison.
 * That is, two cards with the same cvv codes and numbers but different amounts are considered the same.
 * Provide for different variants of the output message
 * (for example, the client does not have any cards, the client does not have the same cards and other possible situations.)*/
public class Runner {

    public static void main(String[] args) {
        Client client1 = new Client("Lisa");

        client1.setCards(ArrayOfCard.createArrayCard());

        if(client1.getCards().length == 0){
            System.out.println("incorrect number of cards");
        } else if(client1.getCards().length == 1){
            System.out.println("You have only one card");
        } else {
            SameCard.showNumberIdenticalCards(client1.getCards());
        }
    }

}
