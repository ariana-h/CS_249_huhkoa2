package edu.huhkoa2.Exercises_05;

public class DisasterCheck {
    public static void main(String [] args){
        Disaster d = Disaster.LOST_FOOD;

        switch(d){
            case CHOLERA, DYSENTERY -> System.out.println("you are sick!");
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> 
                System.out.println("wagon stuck");
            case LOST_FOOD -> {
                System.out.println("we're going to starve");
                System.out.println("No food");
            }
            default -> System.out.println("all's good");
        }

        //new syntax
        int totalFood = 100;
        String statusReport = switch(d) {
            case CHOLERA, DYSENTERY -> "ILLNESS";
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> "EQUIPMENT FAILURE";
            case LOST_FOOD -> {
                totalFood = 10;
                yield "FOOD LOSS";
            }
            default -> "EVERTHING OK";
        };   //need semicolon here

        System.out.println("Total food: " + totalFood);
        System.out.println("Status: " + statusReport);
    }
}
