package edu.huhkoa2.Exercises_15.Decorator;

public class CentralPark {
    public static void main(String [] args){
        Beverage b = new DarkRoast();
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Whip(b);

        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
