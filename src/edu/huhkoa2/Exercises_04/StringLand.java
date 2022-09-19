package edu.huhkoa2.Exercises_04;

import java.util.*;

public class StringLand {
    public static void main(String [] args){

        final int WIDTH = 50;
        Scanner userInput = new Scanner(System.in);

        String finalOutput = ""; //empty string has "" w/o space in-between
        int lineCnt = 5;
        System.out.println("Enter 5 lines:");

        for(int k = 0; k < lineCnt; k++){
            String s = userInput.nextLine();
            int padding = WIDTH - s.length();
            /*
            String output = s;  //output and s are references to the same place
            for(int i = 0; i < padding; i++){
                output = output + "*";
            }
            */
            StringBuilder bob = new StringBuilder();
            bob.append(s);
            for(int i=0;i<padding;i++){
                bob.append("*");
            }
            String output = bob.toString();
            finalOutput += output + "\n";
        }

        System.out.println("OUTPUT:");
        System.out.println(finalOutput);
        
        userInput.close();
    }
}
