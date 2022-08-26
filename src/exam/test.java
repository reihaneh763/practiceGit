package exam;

public class test {
    public int number;
    public double real;
    public boolean condition;
    public String name;

    public test(int num, String title) {
        number = num;
        name = title;
    }

    public static void main(String[] args) {
        test q = new test(2, "ali");
        System.out.println(q.number);
        System.out.println(q.real);
        System.out.println(q.condition);
        System.out.println(q.name);
        One[] o = new One[10];

    }
}
