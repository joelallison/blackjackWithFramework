package com.joelallison;

public class Card {

    //declaring codes for suits / special values so I can either type the name of the thing (readability) or generate an int
    //don't want jokers for blackjack but will include them anyway... 'includeJoker' option just means the value is 1-14 (with) 1-13 (without)
    public final static int CLUBS = 0;
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    public final static int JOKER = 14;


    private final int suit;
    private final int value;

    //blank declaration
    public Card(){
        value = 1;
        suit = JOKER;
    }

    //specified declaration
    public Card(int itsValue, int itsSuit){
        value = itsValue;
        suit = itsSuit;
    }

    public int getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }
}
