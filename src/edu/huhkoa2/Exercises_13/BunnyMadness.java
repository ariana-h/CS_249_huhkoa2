package edu.huhkoa2.Exercises_13;

public class BunnyMadness {
    public static void main(String [] args){
        OBJModel model = new OBJModel();

        try{
            model.load("bunny.obj");
            model.scale(1.0,2.0,1.0);
            model.save("bunnyStretched.obj");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
