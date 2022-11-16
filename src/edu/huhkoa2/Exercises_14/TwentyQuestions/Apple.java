package edu.huhkoa2.Exercises_14.TwentyQuestions;

public class Apple extends Fruit implements Flammable{
    public String howToEat(){
        return "apple pie";
    }

    public String howToIgnite(){
        return "stove";
    }

    public String howToBurn(){
        return "keep in stove too long";
    }

    public String howToBurn(double temp){
        double tooLong = 5*300/temp;
        return "keep in oven for " + tooLong + " hours";
    }
}
