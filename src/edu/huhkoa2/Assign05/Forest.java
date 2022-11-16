package edu.huhkoa2.Assign05;

import java.util.*;

public class Forest {
    private ArrayList<Giant> allG = new ArrayList<>();

    public Giant createGiant(String name, String typeName){
        if(name == ""){
            return null;
        }
        else{
            switch(typeName) {
                case "GIANT" -> {
                    Giant g = new Giant(name);
                    return g;
                }
                case "TROLL" -> {
                    Giant troll = new Troll(name);
                    return troll;
                }
                case "TREE" -> {
                    Giant tree = new Tree(name);
                    return tree;
                }
                case "ENT" -> {
                    Giant ent = new Ent(name);
                    return ent;
                }
                case "HUORN" -> {
                    Giant h = new Huorn(name);
                    return h;
                }
                default -> {
                    return null;
                }
            }
        }
    }

    public boolean addGiant(String name, String typeName){
        Giant cg = createGiant(name, typeName);
        if(cg != null){
            allG.add(cg);
            return true;
        }
        else{
            return false;
        }
    }

    public Giant getGiant(int index){
        if(index >= 0 && index < allG.size()){
            return allG.get(index);
        }
        else{
            return null;
        }
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(Giant g: allG){
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(Giant g: allG){
            if(g instanceof Tree t){
                System.out.println("- " + t.toString() + ": " + t.speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(Giant g: allG){
            if(g instanceof Troll t){
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }

}
