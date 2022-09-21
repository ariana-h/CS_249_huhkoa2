package edu.huhkoa2.Exercises_05;

import java.util.*;

public class BooleanLand {
    public static void main(String [] args){
        Scanner input = null;
        input = new Scanner(System.in);
        System.out.println("Enter number:");
        fancyNumberPrint(input);

        int cnt = 10;
        int randIndex = (int)(Math.random()*cnt); //need to put () otherwise Math.random is cast before its multiplied and bc of its range, its all 0
        System.out.println(randIndex);
    }

    public static void fancyNumberPrint(Scanner in){
        if(in != null && in.hasNext()){ //short circuit evaluation is good in this case so the other half doens't cause a problem
            int x = in.nextInt();
            System.out.println("$$$ " + x + " $$$");
        }
    }

}
