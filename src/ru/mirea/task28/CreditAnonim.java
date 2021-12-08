package ru.mirea.task28;

public class CreditAnonim {
    protected float sum;
    protected float percents;

    CreditAnonim() {
        this.sum = 0;
        this.percents = 0;
    }
    CreditAnonim(float sum, float percents) {
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
    static class PrivilegedCredit extends CreditAnonim {
        protected float sum;
        @Override
        public void pay(float money) {
            this.sum -= money+500;
        }
    }
    public static void main(String[] args) {
        CreditAnonim creditAnonim = new CreditAnonim();
        PrivilegedCredit creditPriveleged = new PrivilegedCredit();
        System.out.println("Выплачен ли кредит " + creditPriveleged.checkIsRepaid());

    }
}
