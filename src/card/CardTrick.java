/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * MODIFIER : MOHEMMED FAAIZ SARFARAZ SHAIKH
 * STUDENT ID NUMBER : 991704798
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            Random random = new Random();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int value = input.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int suit = input.nextInt();
        
        Card UserCard = new Card();
        UserCard.setValue(value);
        UserCard.setSuit(Card.SUITS[suit]);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(UserCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Oops! Your card is not in the magic hand.");
        }
    }
}