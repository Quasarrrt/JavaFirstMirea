package ru.mirea.task26;

public class Deposit extends ProductStrategy {
    Deposit() {
        this.sum = 0;
        this.percents = 0;
    }
    Deposit(float sum, float percents) {
        this.sum = sum;
        this.percents = percents;
    }
    public void depositMoney(float money) {
        this.sum += money;
    }
    public void takeAllMoney() {
        this.sum = 0;
    }
}
