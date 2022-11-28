package edu.huhkoa2.Exercises_15.Observer;

public class GothamCity {
    public static void main(String [] args){
        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barbara = new Batperson("Batgirl");


        Batsignal signal = new Batsignal();
        signal.registerObserver(bruce);
        signal.registerObserver(dick);
        signal.registerObserver(barbara);

        signal.setActiveCrime("a robbery");

        signal.removeObserver(dick);

        signal.setActiveCrime("a weird plot with two boats");
    }
}
