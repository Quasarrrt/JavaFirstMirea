package ru.mirea.task32;

import java.util.Scanner;

public class ProductStrategy {
    protected float sum;
    protected float percents;

    public float checkMoney() {
        return this.sum;
    }
    public void addPercents() {
        this.sum += this.sum * percents;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Credit credit = new Credit(1000, 0.7f);

        System.out.println("Cумма вашего кредита составляет " + credit.checkMoney());
        credit.addPercents();
        System.out.println("С годовыми процентами ваш кредит будет составлять " + credit.checkMoney());

        System.out.print("Введите сумму для оплаты кредита ");
        credit.pay(scanner.nextFloat());
        System.out.println("Оплата принята. Оставаяся сумма по оплате составляет " + credit.checkMoney());

        System.out.print("Введите сумму для депозита ");
        Deposit deposit = new Deposit(scanner.nextFloat(), 0.3f);
        deposit.addPercents();
        System.out.println("С учетом процентом через год ваш депозит будет состовлять " + deposit.checkMoney());
        deposit.takeAllMoney();
        System.out.println("Деньги переведены на ваш счёт, депозит обнулён " + deposit.checkMoney());
    }
}
