package edu.huhkoa2.Assign06;

import edu.huhkoa2.Assign04.CharImage;

public class Skeleton extends Creature{
    public Skeleton(){};

    public Skeleton(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }

    public void draw(CharImage map){
        map.setPos(getRow(), getCol(), 'S');
    }

}
