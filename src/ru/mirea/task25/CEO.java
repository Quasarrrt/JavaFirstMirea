package ru.mirea.task25;

public class CEO extends Employee {
    private float balance;
    private String name;

    public CEO(String name, int acc) {
        super(acc, name);
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return "CEO " + this.name;
    }
}
