package HW4;

public class Account {
    private int id;
    private String accountNumber;
    private CreditCard creditCard;

    Account(int id, String accountNumber, CreditCard creditCard) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return id + ", " + accountNumber + ", " + creditCard;
    }
}
