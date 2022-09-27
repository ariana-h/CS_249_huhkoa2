package edu.huhkoa2.Assign02;

import java.util.*;

public class VitalStats {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String firstName = input.next();
        String lastName = input.next();
        System.out.println("Enter height in inches:");
        int totalNumInches = input.nextInt();
        //convert feet to inches
        int feet = totalNumInches/12;
        int inchesLeft = totalNumInches%12;
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        //compute BMI
        int bmi = (int)((703 * weight)/(totalNumInches * totalNumInches));
        System.out.println("NAME: " + lastName + ", " + firstName);
        System.out.println("WEIGHT: " + weight + " lbs.");
        System.out.println("HEIGHT: " + feet + "'-" + inchesLeft + "\"");
        System.out.println("BMI: " + bmi);
        input.close();
    }
}
