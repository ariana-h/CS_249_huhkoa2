package edu.huhkoa2.Exercises_13;

import java.util.*;
import java.io.*;

public class Quotient {
    public static int quotient(int a, int b){
        if(b==0){
            throw new ArithmeticException("DIVIDE NOT BY ZERO!");
        }
        else{
            return a/b;
        }
    }

    public static void inputPanic() throws IOException{
        /*
        Method 1:
        try{
            throw new IOException("HELPPPP");
        }
        catch(IOException e){
            System.err.println("There. Handled.");
        }
        */

        //Method 2: add thorws IOException up top
        throw new IOException("HELP");
        
    }

    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            int q = quotient(x,y);
            System.out.println("Answer = " + q);
            inputPanic();
        }
        catch(ArithmeticException e){
            System.err.println(e);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.err.println("WHyyyyy?");
        }
        catch(Exception ex){
            System.err.println("Whattt?" + ex);
        }
        System.out.println("Program complete.");
        input.close();
    }
}