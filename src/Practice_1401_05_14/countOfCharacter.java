package Practice_1401_05_14;

import java.util.Arrays;
import java.util.Scanner;

public class countOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String sentence = sc.next();
        int [] counter;
        counter = countOfCharacter(sentence);
        int maxIndex = maximumIndex(counter);
        int minIndex = minimumIndex(counter);

        System.out.println(getAlphabet(maxIndex));
        System.out.println(getAlphabet(minIndex));

    }

    public static int[] countOfCharacter(String sentence) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] counter = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            counter[i] = 0;
            for (char character : sentence.toCharArray()) {
                if (alphabet[i] == character)
                    counter[i] += 1;
            }
        }
        return counter;
    }

    public static int maximumIndex(int[] alphabetCounter) {
        int largest = 0;
        for (int i = 1; i < alphabetCounter.length; i++) {
            if (alphabetCounter[i] > alphabetCounter[largest])
                largest = i;
        }
        return largest;
    }

    public static int minimumIndex(int[] alphabetCounter) {
        int smallest = 0;
        for (int i = 1; i < alphabetCounter.length; i++) {
            if (alphabetCounter[i] < alphabetCounter[smallest])
                smallest = i;
        }
        return smallest;
    }

    public static char getAlphabet(int index) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char character = alphabet[index];
        return character;
    }
}

