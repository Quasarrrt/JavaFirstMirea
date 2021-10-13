package ru.mirea.task10;

public class Task10 {
    public static int func(int a){
        if(a<=9){
            System.out.printf ("%s", a%10, "");
            return a;
        }
        else {
            System.out.printf (a%10+"");
            return func(a / 10);
        }
    }
    public static void main(String[] args) {
        int a=2342565;
        func(a);
    }
}
