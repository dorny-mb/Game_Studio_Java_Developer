package com.flexinfor;

import java.util.*;

public class Round extends Roulette implements RoundInterface{


    private static final short ROUND_TIME = 30000;


    public Round(){
        super();
    }
    public Round(List users){
        super(users);
        randomNumber = genRandom();
    }

//generates the random number
    private byte genRandom(){
        return (byte) Math.round(Math.random() * 36);
    }

//    run round
    @Override
    public void run() {
        Timer timer = new Timer();
        TimerTask results = new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n\n\n--------------------\n" +
                        "here are the results" +
                        "\n--------------------\n");
                System.out.println(
                        "Number: "+randomNumber+
                                "\n-----------" + "\nPlayer \t|\t Bet \t|\t Outcome \t|\t Winnings \n" +
                                "===========================================================\n");
                for(Bets bet : bets){
                    if(bet instanceof BetOpts){

                        System.out.println(bet.getUsername() + " \t|\t " +((BetOpts) bet).getChosenOption()+ " \t|\t " + (bet.getWin() ? "WIN" : "LOSE" )+ " \t|\t " + bet.getWinning());
                    }else if(bet instanceof BetStraight){
                        System.out.println(bet.getUsername() + " \t|\t " +((BetStraight) bet).getChosenNumber()+ " \t|\t " + (bet.getWin() ? "WIN" : "LOSE" )+ " \t|\t " + bet.getWinning());
                    }
                }
                clearer();

                landingTexts();
                System.out.print("-> ");
            }
        };

        timer.schedule(results,ROUND_TIME,ROUND_TIME);

        landingTexts();

        takeBets();

    }


//    clears the bets list and generate a new random number for the next round
    private void clearer() {
        bets.clear();
        randomNumber = genRandom();
    }
}
