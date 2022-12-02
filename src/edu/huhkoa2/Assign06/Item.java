package edu.huhkoa2.Assign06;

import java.util.*;

public class Item implements Loadable{
    private String ID = "";
    private int value = 0;
    
    public Item(){};

    public Item(String ID, int value){
        setID(ID);
        setValue(value);
    }

    public String getID(){
        return ID;
    }

    public int getValue(){
        return value;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void setValue(int value){
        this.value = value;
    }    

    public String toString(){
        return ID + " with value " + value;
    }

    public void load(Scanner input) throws GameFileException{
        try{
            ID = input.next();
            value = input.nextInt();
        }
        catch(Exception e){
            ID = "";
            value = 0;
            throw new GameFileException("Error loading Item", e);
        }
        
    }

}
