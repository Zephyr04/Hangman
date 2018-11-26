import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

import java.util.Scanner;

public class Hangman {
    public static void main(String[]args){
        Scanner keyboard;
        String word,letter;
        int numbermissed=0;

        keyboard = new Scanner(System.in);


        System.out.println("Select a word under 15 letters.");
        word=keyboard.nextLine();
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println(" " );
        System.out.println("Now user two guess a letter.");
        letter=keyboard.next();
        if (letter.equals(word)){
        System.out.println("_______");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("_______|");
    }else if (letter!=word){
        System.out.println("________");
        System.out.println("   |   |");
        System.out.println("   0   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("_______|");}



















    }
}
