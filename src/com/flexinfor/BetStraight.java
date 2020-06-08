package com.flexinfor;


public class BetStraight extends Bets{
    private byte chosenNumber;



    public BetStraight(){
        super();
    }
    public BetStraight(String username, byte chosenNumber, double betAmount, boolean win, double winning){
        super(username,betAmount,win,winning);
        this.chosenNumber = chosenNumber;

    }

    public byte getChosenNumber() {
        return chosenNumber;
    }



    @Override
    public String toString() {
        return "Bet{" +
                ", chosenNumber=" + chosenNumber +
                '}';
    }
}
