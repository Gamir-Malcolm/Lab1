//*Write a recursive method called 'vowels', that returns the number of vowels in a string. *//

import java.util.Scanner;

public class vowels {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This program counts the number of vowels in a word.");
        System.out.println (" ");
        System.out.print("Please enter a word --->");
        String word = sc.nextLine();

        System.out.println(("The word you entered, "+ word +" has ") + VowelCount(word, word.length()) + " vowels");
    }

    public static int VowelCheck (char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else return 0;
    }
    public static int VowelCount(String word, int n){
        if (n==1)
            return VowelCheck(word.charAt(0));

        return VowelCount(word, n-1) + VowelCheck(word.charAt(n - 1));
    }

}