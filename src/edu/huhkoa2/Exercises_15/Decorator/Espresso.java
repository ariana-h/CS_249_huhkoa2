package edu.huhkoa2.Exercises_15.Decorator;

public class Espresso extends Beverage{
    public Espresso(){
        super("espresso");
    }

    public double cost(){
        return 1.99;
    }
}
