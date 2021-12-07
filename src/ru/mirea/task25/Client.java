package ru.mirea.task25;

public class Client {
    private String clientName;
    private int accountID;
    private float accountBalance;

    Client(){
        this.clientName = "test";
        this.accountID = 12345567;
        this.accountBalance = '0';
    }
    Client(String name, int account, float balance){
        this.clientName = name;
        this.accountID = account;
        this.accountBalance = balance;
    }
    public void setClientName(String name) {
        this.clientName = name;
    }
    public String getClientName() {
        return this.clientName;
    }
    public void setAccountID(int id) {
        this.accountID = id;
    }
    public int getAccountID() {
        return this.accountID;
    }
    public void setAccountBalance(float balance) {
        this.accountBalance = balance;
    }
    public float getAccountBalance() {
        return this.accountBalance;
    }
    public void changeBalance(float money) {
        this.accountBalance = money;
    }
}
