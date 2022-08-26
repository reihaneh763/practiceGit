package Practice_1401_05_27.Question3;

public class Main {
    public static void main(String[] args) {
        Time firstTime = new Time();
        firstTime.setHour(13);
        firstTime.setMinute(45);
        firstTime.setSecond(59);

        Time secondTime = new Time();
        secondTime.setHour(13);
        secondTime.setMinute(45);
        secondTime.setSecond(59);

        Time thirdTime = new Time();
        thirdTime.setHour(3);
        thirdTime.setMinute(25);
        thirdTime.setSecond(35);

        System.out.println("first time is equal second time: " + firstTime.equals(secondTime));
        System.out.println("second time is equal third time: " + secondTime.equals(thirdTime));

        System.out.println(firstTime.getHour() + ":" + firstTime.getMinute() + ":" + firstTime.getSecond() + firstTime.amOrPm());
        System.out.println(secondTime.getHour() + ":" + secondTime.getMinute() + ":" + secondTime.getSecond() + secondTime.amOrPm());
        System.out.println(thirdTime.getHour() + ":" + thirdTime.getMinute() + ":" + thirdTime.getSecond() + thirdTime.amOrPm());
    }
}
