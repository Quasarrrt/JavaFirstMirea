package ru.mirea.task25;

public class Employee {
    private String employeeName;
    private int accountID;
    Employee() {
        this.accountID = 1234567;
        this.employeeName = "new employee";
    }
    Employee(int acc, String name) {
        this.accountID = acc;
        this.employeeName = name;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public int getAccountID() {
        return this.accountID;
    }
}
