package edu.huhkoa2.Exercises_13;

public class TestDrive {
    public static void drive(Car c){
        /*
        try{
            System.out.println("I like driving my " + c.getMake());
        }
        catch(Exception e){
            System.out.println("I hate driving.");
        }
        */
        
        //Don't use exception handling if you don't have to
        if(c != null){
            System.out.println("I like driving my " + c.getMake());
        }
        else{
            System.out.println("I hate driving.");
        }
    }

    public static void main(String [] args){
        Car myCar = new Car("Subaru");
        drive(myCar);
        drive(null);
    }

}
