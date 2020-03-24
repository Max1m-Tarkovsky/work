package com.ua.udemy.Collection;

import java.util.*;

public class CollectionSortComperatoAndComperator {
    public static void main(String[] args) {
        List<Card> deckOtCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOtCards.add(new Card(suit, face));
            }
        }

        System.out.println(" Original deck of card ");
        for (int i = 0; i < deckOtCards.size(); i++) {
            System.out.printf("%-20s %s", deckOtCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
        Collections.shuffle(deckOtCards);

        System.out.println("\n\n Cards after Shuffles ");
        for (int i = 0; i < deckOtCards.size(); i++) {
            System.out.printf("%-20s %s", deckOtCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
        Collections.sort(deckOtCards, Collections.reverseOrder());
        System.out.println("\n\n Cards after  reverse sort  ");
        for (int i = 0; i < deckOtCards.size(); i++) {
            System.out.printf("%-20s %s", deckOtCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
        Collections.sort(deckOtCards);
        System.out.println("\n\n Cards after sort   ");
        for (int i = 0; i < deckOtCards.size(); i++) {
            System.out.printf("%-20s %s", deckOtCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
        Collections.sort(deckOtCards, new CardComparator());
        System.out.println("\n\n Cards after Comparator  sort  ");
        for (int i = 0; i < deckOtCards.size(); i++) {
            System.out.printf("%-20s %s", deckOtCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }


    }

    public static class Card implements Comparable<Card> {


        private enum Suit {SPADES, HEARTS, CLUBS, DIMONDS}

        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Suit suit;
        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {

            Face[] value = Face.values();
            List<Face> faces = Arrays.asList(value);

            if (faces.indexOf(this.face) < faces.indexOf(card.face)) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.face)) {
                return 1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.face)) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));

            }

            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }

    public static class CardComparator implements Comparator<Card> {

        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card card1, Card card2) {
            if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
                return 1;
            } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
                return -1;
            } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())) {
                return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));

            }

            return 0;
        }

    }

}
