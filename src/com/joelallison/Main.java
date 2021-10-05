package com.joelallison;

import java.util.*;

//array for player hand, array for computer hand
//emulating a card deck with objects, as it'll mean I don't have to worry about duplicates of cards (even though that's not too hard to deal with)
//and objects are fun!!
//having code that allows me to emulate cards means I could do any card game and re-use the cards
//learnt about name binding, and I plan to have arrays of cards (a hand object is basically just an array so why not)

//considering eventually writing a 'proper' game version using libgdx..?

public class Main {


    public static void main(String[] args) {
        ArrayList<String> playerHand = new ArrayList<String>();
        ArrayList<String> computerHand = new ArrayList<String>();
        int round = 0;

        System.out.println("Blackjack");

        //game loop
        boolean playing = true;
        do{
            round++;

            System.out.println("Round" + round);
        }while (playing);
    }
}