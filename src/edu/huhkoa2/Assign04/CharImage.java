package edu.huhkoa2.Assign04;

public class CharImage {
    private char [][] chars;
    private char fillChar;
    
    public CharImage(int rowCnt, int colCnt, char fillChar){
        chars = new char [rowCnt][colCnt];
        this.fillChar = fillChar;
        clear();
    }

    public void clear(){
        for(int i = 0; i < getRowCnt(); i++){
            for(int j = 0; j < getColCnt(); j++){
                chars[i][j] = fillChar;
            }
        }
    }

    public int getRowCnt(){
        return chars.length;
    }

    public int getColCnt(){
        return chars[0].length;
    }

    public boolean isValidPosition(int row, int col){
        if((row >= 0 && row < getRowCnt()) && (col >= 0 && col < getColCnt())){
            return true;
        }
        else{
            return false;
        }
    }

    public char getPos(int row, int col){
        if(isValidPosition(row, col)){
            return chars[row][col];
        }
        else{
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c){
        if(isValidPosition(row, col)){
            chars[row][col] = c;
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return getRowCnt() + " x " + getColCnt() + " CharImage (default: " + fillChar + ")";
    }

    public String getMapString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < getRowCnt(); i++){
            for(int j = 0; j < getColCnt(); j++){
                sb.append(chars[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
