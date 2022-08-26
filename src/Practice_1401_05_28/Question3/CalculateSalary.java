package Practice_1401_05_28.Question3;

public class CalculateSalary {
    private final double INSURANCE = 0.07;
    private final double TAX = 0.1;
    private final long CONDITION_BASE_SALARY = 485000000;

    public long calculateSalary(long salary){
        if(salary > CONDITION_BASE_SALARY)
            return (long)(salary * (1 -(TAX + INSURANCE)));
        return (long)(salary * (1 - INSURANCE));
    }
}
