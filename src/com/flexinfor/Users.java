package com.flexinfor;



public class Users{
    private String username;
    private double totalWins = 0;
    private double totalBets = 0;
    public Users(String username, double totalWins, double totalBets){
        this.username = username;
        this.totalWins = totalWins;
        this.totalBets = totalBets;
    }

    public String getUsername() {
        return username;
    }

    public double getTotalBets() {
        return totalBets;
    }

    public double getTotalWins() {
        return totalWins;
    }

    public void setTotalBets(double totalBets) {
        this.totalBets = totalBets;
    }

    public void setTotalWins(double totalWins) {
        this.totalWins = totalWins;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void getStatistics(){
        System.out.println(this);
    }
    @Override
    public String toString() {

        return "\nPlayer \t|\t Total Win \t|\t Total Bet \n" +
                "--------------------------------------------------\n" +
                 username + " \t|\t " + totalWins + " \t|\t " + totalBets;
    }
}
