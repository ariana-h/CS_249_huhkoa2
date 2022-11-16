package edu.huhkoa2.Exercises_14.TwentyQuestions;

public class Chicken extends Animal implements Edible, Flammable {
    public String howToEat(){
        return "BBQ";
    }

    public String howToIgnite(){
        return "BBQ grill";
    }

    public String howToBurn(){
        return "keep on grill too long";
    }

    public String howToBurn(double temp){
        double tooLong = 5*300/temp;
        return "keep on grill for " + tooLong + " hours";
    }
}
