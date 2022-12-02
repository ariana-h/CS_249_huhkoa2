package edu.huhkoa2.Assign06;

import java.util.*;
import java.io.*;
import edu.huhkoa2.Assign04.CharImage;

public class GameState implements Loadable{
    private ArrayList<Loadable> list = new ArrayList<>();
    private CharImage map = new CharImage(12,30,'.');
    private int lines;
    private String typeName;
    private Loadable m = null;
    
    public Loadable createLoadable(String typeName) throws GameFileException{
        switch(typeName) {
            case("Skeleton") -> {
                m = new Skeleton();
            }
            case("Rat") -> {
                m = new Rat();
            }
            case("Item") -> {
                m = new Item();
            }
            case("Book") -> {
                m = new Book();
            }
            default -> {
                throw new GameFileException("Unknown type: " + typeName);
            }
        }
        return m;
    }

    public void load(Scanner input) throws GameFileException{
        map.clear();
        list.clear();

        lines = input.nextInt();
        for(int i = 0; i < lines; i++){
            typeName = input.next();
            m = createLoadable(typeName);
            m.load(input);
            list.add(m);
            if(m instanceof Drawable d){
                d.draw(map);
            } 
        }
    }

    public String toString(){
        String s = "MAP:\n" + map.getMapString() + "\n" + "CREATURES:\n";
        for(Loadable l: list){
            if(l instanceof Creature c){
                s+=c;
                s+="\n";
            }
        }
        s += "INVENTORY:\n";
        for(Loadable l: list){
            if(l instanceof Item i){
                s+=i;
                s+="\n";
            }
        }
        return s;
    }

    public void save(String filename) throws GameFileException{
        try{
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        }
        catch(Exception e){
            throw new GameFileException("Failed to save file!", e);
        }
    }

}
