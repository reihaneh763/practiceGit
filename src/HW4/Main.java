package HW4;

public class Main {
    public static void main(String[] args) {
        Branch branch0 = new Branch(32, "Qom", 5);
        Branch branch = new Branch(45, "Tehran", 1);
        CreditCard creditCard = new CreditCard(125, "1235-8456-9874-5694", 12e+4);
        Account account = new Account(123, "28469745", creditCard);
        Customer customer = new Customer(123, "reihaneh Mahjour", account);

        System.out.println("Branch info(id, city, quality): " + branch0);
        System.out.println("Branch info(id, city, quality): " + branch);
        System.out.println("CreditCard info(id, cardNumber, credit): " + creditCard);
        System.out.println("Account info(id, accountNumber, creditCardInfo): " + account);
        System.out.println("Customer info(id, name, accountInfo): " + customer);
        System.out.println("Credit: " + customer.calCustomerBalance());

    }
}
