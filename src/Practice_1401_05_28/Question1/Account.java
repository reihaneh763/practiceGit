package Practice_1401_05_28.Question1;

public class Account {
    private int id;
    private long serialNumber;
    private String type;
    private Branch branch;
    private Person person;
    private long amount;
    private String shebaNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        this.shebaNumber = shebaNumber;
    }

    public long deposit(long amount) {
        return this.amount += amount;
    }

    public long withdraw(long amount) {
        if (this.amount > amount)
            return this.amount -= amount;
        return this.amount;
    }

}
