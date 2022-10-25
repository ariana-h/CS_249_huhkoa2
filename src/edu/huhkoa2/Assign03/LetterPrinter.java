package edu.huhkoa2.Assign03;

import java.util.*;

public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input){
        System.out.println("Enter business name:");
        String businessName = input.nextLine();
        System.out.println("Enter boundary character:");
        char boundary = input.nextLine().charAt(0);
        String [] sloganLines = new String [4];
        System.out.println("Enter slogan (max 4 lines):");
        for(int i = 0; i < 4; i++){
            sloganLines[i] = input.nextLine();
        }
        Letterhead letter = new Letterhead(businessName, sloganLines, boundary);
        return letter;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Letterhead header = LetterPrinter.askForLetterheadData(input);
        System.out.println("Your new letterhead:");
        System.out.println(header);
        input.close();
    }
}

