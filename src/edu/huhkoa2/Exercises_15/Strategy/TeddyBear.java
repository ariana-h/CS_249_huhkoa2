package edu.huhkoa2.Exercises_15.Strategy;

public class TeddyBear extends Bear {
    public TeddyBear(){
        super(new NoMove());
    }
}
