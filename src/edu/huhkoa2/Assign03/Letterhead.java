package edu.huhkoa2.Assign03;

public class Letterhead {
    private String name;
    private String [] slogan;
    private char boundaryChar;

    public Letterhead(String name, String [] sloganLines, char boundaryChar){
        setName(name);
        setSlogan(sloganLines);
        setBoundaryChar(boundaryChar);
    }

    public String getName(){
        return name;
    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public String getSlogan(){
        String s = "";
        for(int i = 0; i < slogan.length; i++){
             s += slogan[i];
             s += "\n";
        }
        return s;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }
    
    public void setSlogan(String [] sloganLines){
        slogan = new String [sloganLines.length];
        for(int i = 0; i < sloganLines.length; i++){
            slogan[i] = sloganLines[i];
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        String empty = "";
        //Row of boundary characters
        for(int i = 0; i < 40; i++){
            sb.append(boundaryChar);
        }

        //Business name
        sb.append("\n" + boundaryChar + " " 
                  + name + padSpaces(name.length()) 
                  + boundaryChar + "\n" + boundaryChar 
                  + " " + padSpaces(empty.length()) 
                  + boundaryChar + "\n");

        //Slogan name
        for(int i = 0; i < slogan.length; i++){
            sb.append(boundaryChar + " " + slogan[i] 
                      + padSpaces(slogan[i].length()) 
                      + boundaryChar + "\n");
        }
        
        //Padding empty lines
        int padLines = 4 - slogan.length;
        for(int i = 0; i < padLines; i++){
            sb.append(boundaryChar + " " + padSpaces(empty.length()) 
                      + boundaryChar + "\n");
        }

        //Row of boundary characters
        for(int i = 0; i < 40; i++){
            sb.append(boundaryChar);
        }
        sb.append("\n");

        return sb.toString();
    }

    private String padSpaces(int length){
        String str = "";
        for(int i = 0; i < (37 - length); i++){
            str += " ";
        }
        return str;
    }
}
