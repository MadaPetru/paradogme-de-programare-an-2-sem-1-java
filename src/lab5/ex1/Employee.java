package lab5.ex1;

public class Employee {
    private String name;
    private String email;
    private float hourRate;
    private float capacity;
    private short freeDays;

    public Employee(String name, String email, float hourRate, float capacity, short freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public float calculateDailyIncome(){
        return hourRate * capacity;
    }

    public float calculateMonthlyIncome(){
        return calculateDailyIncome() * (21 - freeDays);
    }
}
