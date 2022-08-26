package Practice_1401_05_13_Part2;

public class SwapString {
    public static void main(String args[]) {
        String string1 = "Hello";
        String string2 = "Fatemeh";

        System.out.println("Strings before swap: " + string1 + " " + string2);
        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());//str1 = HelloFatemeh
        string1 = string1.substring(string2.length());
        System.out.println("Strings after swap: " + string1 + " " + string2);
    }
}
