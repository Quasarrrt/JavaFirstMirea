package ru.mirea.task32;

public class Credit extends ProductStrategy {
    Credit() {
        this.sum = 0;
        this.percents = 0;
    }
    Credit(float sum, float percents) {
        this.sum = sum;
        this.percents = percents;
    }
    public void pay(float money) {
        this.sum -= money;
    }
    public boolean checkIsRepaid() {
        if (this.sum  <= 0) {
            return true;
        }
        return false;
    }
}
