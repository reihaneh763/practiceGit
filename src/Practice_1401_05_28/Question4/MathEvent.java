package Practice_1401_05_28.Question4;

public class MathEvent {
    public static boolean isOdd(int number) {
        if (number % 2 == 0)
            return false;
        return true;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }

    public static boolean isSquare(int number) {
        //return (Math.sqrt(number) % 1 == 0);
        double floorNumber = Math.floor(Math.sqrt(number));
        if(Math.pow(floorNumber,2) == number)
            return true;
        return false;
    }

    public static boolean isPerfect(int number) {
        int sumOfNumbers = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0)
                sumOfNumbers += i;
            i++;
        }
        if (sumOfNumbers == number)
            return true;
        return false;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int number) {
        if (number == 0)
            return 1;
        return (number * factorial(number - 1));
    }
}
