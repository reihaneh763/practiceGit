package Practice_1401_05_28.Question1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Person person = new Person();
        Branch branch = new Branch();
        account.setId(1234);
        account.setAmount(12000000);
        account.setType("jari");
        account.setSerialNumber(123493578);
        account.setShebaNumber("IR001234569870000152387");

        System.out.println(account.deposit(5000000));
        System.out.println(account.withdraw(800000));
        System.out.println(account.withdraw(18000000));
    }
}
