package Practice_1401_05_14;

import java.util.Scanner;

public class CountOfRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String sentence = sc.next();
        int[] count = new int[sentence.length()];
        char minCharacter = sentence.charAt(0);
        char maxCharacter = sentence.charAt(0);

        char characterOfSentence[] = sentence.toCharArray();

        for (int i = 0; i < characterOfSentence.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < characterOfSentence.length; j++) {
                if (characterOfSentence[i] == characterOfSentence[j] && characterOfSentence[i] != ' ' && characterOfSentence[i] != '0') {
                    count[i]++;
                    characterOfSentence[j] = '0';
                }
            }
        }
        int min, max;
        min = max = count[0];
        for (int i = 0; i < count.length; i++) {
            if (min > count[i] && count[i] != '0') {
                min = count[i];
                minCharacter = characterOfSentence[i];
            }
            if (max < count[i]) {
                max = count[i];
                maxCharacter = characterOfSentence[i];
            }
        }

        System.out.println("Minimum occurring character: " + minCharacter);
        System.out.println("Maximum occurring character: " + maxCharacter);
    }
}
