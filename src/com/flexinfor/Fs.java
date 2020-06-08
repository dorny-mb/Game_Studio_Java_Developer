package com.flexinfor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fs {
    static final String FILE_PATH = "/src/com/flexinfor/Players.txt";
    public static List<Users> getUsers() throws IOException {

        FileInputStream usersFile = new FileInputStream(System.getProperty("user.dir")+FILE_PATH);
        InputStreamReader iSReader = new InputStreamReader(usersFile);
        BufferedReader buffReader = new BufferedReader(iSReader);

        List<String> usersDetails = new ArrayList<>(10);
        String line;
        while ( (line = buffReader.readLine()) != null) {
            usersDetails.add(line);
        }

        buffReader.close();
        iSReader.close();
        usersFile.close();

        List<Users> users = new ArrayList<>(10);

        for (String user: usersDetails) {
            String[] details = user.split(",");

            users.add(new Users(details[0],Double.parseDouble(details[1]),Double.parseDouble(details[2])));

        }

        return users;
    }

    public static boolean saveUsersInfos(List<Users> users) throws IOException {
        File usersFile = new File(System.getProperty("user.dir")+FILE_PATH);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(usersFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        OutputStreamWriter oSWriter = new OutputStreamWriter(fos);
        BufferedWriter buffWriter = new BufferedWriter(oSWriter);

        String userInfos = "";
        for (Users user :
                users) {
            user.getTotalWins();

            userInfos += user.getUsername()+','+user.getTotalBets()+','+user.getTotalWins()+'\n';
        }



        try {
            buffWriter.write(userInfos);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


        buffWriter.flush();
        buffWriter.close();
        oSWriter.close();
        fos.close();
        return true;
    }
}
