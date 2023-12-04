package com.teachmeskiils.lesson10.task0.model.client;

import com.teachmeskiils.lesson10.task0.model.card.Card;

public class Client {

    public String name;
    private Card[] cards;

    public Client(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

}
