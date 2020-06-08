package com.flexinfor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Roulette {
    protected static byte randomNumber = 0;
    protected static List<Users> users;
    protected static List<Bets> bets = new ArrayList<>();
    private static Scanner sc = null;


    public Roulette(){

    }
    public Roulette(List<Users> users){
        this.users = users;
    }


    //take bets

    protected static void takeBets(){

        sc = new Scanner(System.in);
        sc.reset();

        System.out.print("-> ");

        String currentBet = "";

        if (sc.hasNextLine()) {
            currentBet = sc.nextLine().trim();
        } else {
            System.out.println("Invalid input. Please try again.");
            sc.next();
            System.out.println();
        }

        Dealer.processBet(currentBet);

    }
    protected void landingTexts(){
        System.out.println("\n\nPlace your bets" +
                "\n===============\n\n" +
                "Format -> (username chosen_number bet_amount)\n" +
                "e.g 1: Tiki_Monkey 17 10.0\n" +
                "e.g 2: Barbara EVEN 20\n");

    }
}
