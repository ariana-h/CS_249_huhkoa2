package edu.huhkoa2.Exercises_11;

import java.util.*;

public class Party {
    private Person [] people;
    
    public Party(String [] names){
        people = new Person[names.length];  //DON'T FORGET TO ALLOCATE SPACE
        for(int i = 0; i < names.length; i++){
            people[i] = new Person(names[i]);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY:\n");
        boolean anyAlive = false;
        /*
        for(int i = 0; i < people.length; i++){
            if(people[i].isAlive()){
                sb.append("* " + people[i] + "\n");
                anyAlive = true;
            }
        }
        */
        for(Person p: people){
            if(p.isAlive()){
                sb.append("* " + p + "\n");
                anyAlive = true;
            }
        }
        if(!anyAlive){
            sb.append("No one survived :'( \n");
        }
        return sb.toString();
    }

    public boolean areAnyAlive(){
        boolean anyAlive = false;
        for(Person p: people){
            if(p.isAlive()){
                anyAlive = true;
                break;
            }
        }
        return anyAlive;
    }

    public boolean killRandom(){
        if(!areAnyAlive()){
            return false;
        }
        //Solution 1
        //keep randomly picking indices --> inefficient

        //Solution 2
        //get a list of indices of anyone who is alive
        /*
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for(int i = 0; i < people.length; i++){
            if(people[i].isAlive()){
                indices.add(i); // autoboxing int --> Integer
            }
        }
        //randomly select one of those indices to murder
        int randIndex = (int)(Math.random()*indices.size());
        int unfortunateIndex = indices.get(randIndex);
        people[unfortunateIndex].kill();
        System.out.println(people[unfortunateIndex] + "has passed on.");
        */

        //Solution 3
        //maintain list of Persons who are still alive
        ArrayList<Person> stillAlive = new ArrayList<Person>();
        for(Person p: people){
            if(p.isAlive()){
                stillAlive.add(p);
            }
        }
        
        int unfortunateIndex = (int)(Math.random()*stillAlive.size());
        stillAlive.get(unfortunateIndex).kill();
        System.out.println(stillAlive.get(unfortunateIndex) + "has pessed on.");

        return true;

    }



}
