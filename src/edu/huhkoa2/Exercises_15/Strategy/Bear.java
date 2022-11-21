package edu.huhkoa2.Exercises_15.Strategy;

public abstract class Bear {
    protected Movable mbehavior;

    protected Bear(Movable m){
        mbehavior = m;
    }

    public void performMove(){
        mbehavior.move();
    }

    public void setMoveBehavior(Movable m){
        mbehavior = m;
    }
}
