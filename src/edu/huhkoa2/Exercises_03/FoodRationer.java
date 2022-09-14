package edu.huhkoa2.Exercises_03;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter total food:");
        int totalFood = input.nextInt();

        System.out.println("Enter people count:");
        int peopleCount = input.nextInt();

        System.out.println("Enter rations:"); //don't put space after colon
        double rations = input.nextDouble();

        double foodPerDay = peopleCount * rations;
        int days = (int)(totalFood/foodPerDay); //casting

        System.out.println("Days left: " + days);
    }
    
}
