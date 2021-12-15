package ru.mirea.task32;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> debtors = new HashMap<>();
        debtors.put("+79372323129", "Клим Жуков");
        debtors.put("+79272326720", "Илья Мэдиссон");
        debtors.put("+78272s26725", "Владимир Дуболом");
        debtors.put("+79112626723", "Игорь Кузнецом");
        debtors.put("+79232526720", "Александр Коробкин");
        debtors.put("+79274526324", "Роман Юнеман");

        System.out.println(debtors);

        System.out.print("Введите номер телфона и имя должника: ");

        debtors.put(scanner.nextLine(), scanner.nextLine());
        System.out.println(debtors);
        System.out.print("Введите номер телефона клиента, чтобы найти его в базе ");
        System.out.println(debtors.get(scanner.nextLine()));
        System.out.print("Введите номер телефона должника, которога необходима удалить ");
        System.out.println(debtors.remove(scanner.nextLine()));
        System.out.println(debtors);
        System.out.print("Введите имя должника для проверки его наличия в базе ");
        System.out.println(debtors.containsValue(scanner.nextLine()));
        System.out.println("Количество активных должников в базе " + debtors.size());
    }
}
