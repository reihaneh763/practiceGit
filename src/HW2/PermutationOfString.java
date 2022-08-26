package HW2;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string: ");
        String string = scanner.next();
        System.out.println("Permutations of " + string + " are: ");
        permutation(string, 0, string.length());
    }
    public static void permutation(String string, int start, int end)
    {
        if (start == end-1) {
            System.out.println(string);
        }
        else
        {
            for (int i = start; i < end; i++){
                string = swapCharacter(string,start,i);
                permutation(string,start+1,end);
                string = swapCharacter(string,start,i);
            }
        }
    }
    public static String swapCharacter(String subString, int i, int j) {
        char[] swapCharacter =subString.toCharArray();
        char temp;
        temp = swapCharacter[i];
        swapCharacter[i] = swapCharacter[j];
        swapCharacter[j] = temp;
        return String.valueOf(swapCharacter);
    }
}
