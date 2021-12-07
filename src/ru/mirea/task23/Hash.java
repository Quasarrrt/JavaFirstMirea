package ru.mirea.task23;

public class Hash {
    public static void main(String[] args) {
        Client client1 = new Client("Sonya", 1233123, 8900);
        Client client2 = new Client("Sasha", 31231674, 3000);
        Client client3 = new Client("Alex", 312323789, 10);

        System.out.println("Сравним "+client1.getClientName()+" и "+ client3.getClientName());
        System.out.println(client1.equals(client3));
        System.out.println("Сравним "+client2.getClientName()+" и "+client2.getClientName());
        System.out.println(client2.equals(client2));
        System.out.println("Получившиеся хэши");
        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
    }
}
