package edu.huhkoa2.Exercises_12;

import edu.huhkoa2.Exercises_09.Matrix2D;
import edu.huhkoa2.Exercises_13.InvalidRadiusException;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){
        //IMPLICIT: super();
    }

    public Circle(double radius) throws InvalidRadiusException{
        //IMPLICIT: super();
        //this.radius = radius;
        setRadius(radius);
    }

    public Circle(boolean filled, Matrix2D center){
        //this.filled = filled;
        //setCenter(center);
        super(filled, center);
    }

    public Circle(double radius, boolean filled, Matrix2D center) throws InvalidRadiusException{
        super(filled, center);
        //this.radius = radius;
        //this.filled = filled;
        //setCenter(center);
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException{
        if(radius >= 0){
            this.radius = radius;
        }
        else{
            throw new InvalidRadiusException("No negative radii: " + radius);
        }
    }

    public String toString(){
        String s = super.toString();
        s += ", radius " + radius;
        return s;
    }

    public static String getNameOfShape(){
        return "Circle";
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object other){
        boolean isEqual = false;
        if(other instanceof Circle co){
            if(Math.abs(radius - co.radius) < 1e-15 && super.equals(co)){
                isEqual = true;
            }
        }
        return isEqual;
    }
}
