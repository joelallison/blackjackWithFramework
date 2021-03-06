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
        //handling invalid cards
        if (itsSuit != SPADES && itsSuit != HEARTS && itsSuit != DIAMONDS && itsSuit != CLUBS && itsSuit != JOKER) {
            throw new IllegalArgumentException("Illegal playing card suit");
        }
        //jokers can have any value
        if (itsSuit != JOKER && (itsValue < 1 || itsValue > 13)) {
            throw new IllegalArgumentException("Illegal playing card value");
        }

        value = itsValue;
        suit = itsSuit;
    }

    public int getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }

    //handling formatting and making it nice :)
    public String getValueAsString(){
        if (suit == JOKER){ return "Joker " + value; }
        else {
            switch ( value ) {
                case 1:   return "Ace";
                case 2:   return "2";
                case 3:   return "3";
                case 4:   return "4";
                case 5:   return "5";
                case 6:   return "6";
                case 7:   return "7";
                case 8:   return "8";
                case 9:   return "9";
                case 10:  return "10";
                case 11:  return "Jack";
                case 12:  return "Queen";
                default:  return "King";
            }
        }
    }
}
