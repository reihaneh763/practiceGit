package Practice_1401_05_14;

import java.util.Scanner;

public class VowelCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String sentence = sc.next();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (vowelCharacter(sentence.charAt(i)) == true)
                count++;
        }
        System.out.println("count of vowels character: " + count);
        System.out.println("count of consonants character: " + (sentence.length() - count));
    }

    public static boolean vowelCharacter(char character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
