package edu.huhkoa2.Exercises_14.TwentyQuestions;

public class Cedar extends Plant implements Flammable {
    public String howToIgnite(){
        return "campfire";
    }

    public String howToBurn(){
        return "keep in fire too long";
    }

    public String howToBurn(double temp){
        double tooLong = 0.5*1000/temp;
        return "keep in fire for " + tooLong + " hours";
    }
}
