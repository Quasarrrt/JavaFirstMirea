package ru.mirea.task18;

public class ExceptionTest {
    static Client client;
    static void testAccountID(int id) {
        try{

            if(id < 0){
                throw new RuntimeException("Ошибка изменения баланса");
            }else {
                client.setAccountID(id);
            }

        }finally {
            System.out.println("Баланс не может быть отрицательным");
        }
    }

    static void doubleEx () {
        try {
            int numb = 0;
            int k = 5/numb;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка \nДеление на ноль: " + e);
        }
        System.out.println("\nВсе ошибки обработаны");
    }
    public static void main(String[] args) {
        doubleEx();
        testAccountID(-3);
    }
}
