package com.teachmeskiils.lesson10.task0.model.card;

import java.util.Objects;

public class Card {

    private int cvv;
    private long cardNumber;
    private int cardAmount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && cardNumber == card.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        if(100 < cvv && cvv < 1000){
            this.cvv = cvv;
        } else {
            System.out.println("Incorrect CVV. Default value set: 100");
            this.cvv = 100;
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if(cardNumber > 0){
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Incorrect card number");
        }
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(int cardAmount) {
        if(cardAmount > 0){
            this.cardAmount = cardAmount;
        } else {
            System.out.println("Incorrect card Amount");
        }
    }

}
