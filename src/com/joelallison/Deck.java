package com.joelallison;

public class Deck {

    private Card[] deck;
    private int cardsInPlay;

    //put all cards in deck, in order
    public Deck(boolean usingJokers){
        if(usingJokers){
            deck = new Card[54];
        }else{
            deck = new Card[52];
        }
        int count = 0;

        //baking some fresh cards
        for (int suit = 0; suit < 4; suit++) {
            for (int cardValue = 0; cardValue <= 13; cardValue++) {
                deck[count] = new Card(cardValue, suit);
            }
        }
        if(usingJokers){
            deck[52] = new Card(1, Card.JOKER);
            deck[53] = new Card(2, Card.JOKER);
        }
        cardsInPlay = 0;
    }

    public void shuffle(){
        //go through the deck until all are shuffled back in
        for (int i = deck.length-1; i > 0; i--) {
            //type casting Math.random to make it an int
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsInPlay = 0;
    }

    public void print(){
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].getSuit() + " " + deck[i].getValueAsString());
        }
    }

    public int cardsLeft() {
        return deck.length - cardsInPlay;
    }

    //have multiple decks in a game
    private int deckNum = 0;
    public int getDeckNum(){
        return deckNum;
    }
}
