package com.flexinfor;

public class Bets {

    private String username;
    private double betAmount;
    private double winning;
    private boolean win;
    public Bets(){

    }

    public Bets( String username, double betAmount, boolean win, double winning){
        this.username = username;
        this.betAmount = betAmount;
        this.winning = winning;
        this.win = win;
    }
    public double getWinning() {
        return winning;
    }
    public boolean getWin(){
        return win;
    }
    public String getUsername() {
        return username;
    }
    public double getBetAmount() {
        return betAmount;
    }

    @Override
    public String toString() {
        return "Bets{" +
                "username='" + username + '\'' +
                ", betAmount=" + betAmount +
                ", winning=" + winning +
                ", win=" + win +
                '}';
    }
}
