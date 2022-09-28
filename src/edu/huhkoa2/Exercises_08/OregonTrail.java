package edu.huhkoa2.Exercises_08;

import java.util.*;

public class OregonTrail {
    public static String [] getPartyNames(Scanner input){
        //To do
        System.out.println("Enter party count:");
        int cnt = input.nextInt();

        String [] names = new String[cnt];
        
        for(int i = 0; i < cnt; i++){
            names[i] = input.next();
        }

        return names;   //return new String [] {"Bob"};
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Get names from user
        String [] names = getPartyNames(input);

        //Create disaster list
        String [] disasters = {"a broken leg",
                                "dysentery",
                                "been bitten by zombie",
                                "a gunshot wound"};
        int days = 10;
        for(int i = 0; i < days; i++){
            System.out.println("** DAY " + days);
            //Pick a random person
            //int randPersonIndex = (int)(Math.random()*names.length);
            String currentPerson = pickRandomString(names);

            //Pick random disaster
            //int randIndex = (int)(Math.random()*disasters.length);
            String currentDisaster = pickRandomString(disasters);

            //Print results
            System.out.println(currentPerson + "has" + currentDisaster + "!");
        }
        
        input.close();
    }

    public static String pickRandomString(String [] data){
        int randIndex = (int)(Math.random()*data.length);
        return data[randIndex];
    }
}
