package ru.mirea.task32;

public class VIPClient extends Client {
    private float balance;
    private String name;

    public VIPClient(String name, int account, float balance, float bonus) {
        super(name, account, balance + bonus);
        this.balance = balance+bonus;
        this.name = name;

    }

    @Override
    public String getClientName() {
       return "VIP CLIENT" + this.name;
    }

}
