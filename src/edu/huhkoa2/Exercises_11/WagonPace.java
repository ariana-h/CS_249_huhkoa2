package edu.huhkoa2.Exercises_11;

public enum WagonPace {
    SLOW(7),
    NORMAL(15),
    FAST(18);

    private double miles;
    private WagonPace(double miles){
        this.miles = miles;
    }
    

}