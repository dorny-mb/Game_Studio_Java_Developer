package com.flexinfor;


import java.io.IOException;
import java.util.List;



public class Main {

    public static void main(String[] args) {


        List users = null;
        try {
            users = Fs.getUsers();
        } catch (IOException e) {
            e.printStackTrace();
        }
        RoundInterface round = new Round(users);
        round.run();


    }

}
