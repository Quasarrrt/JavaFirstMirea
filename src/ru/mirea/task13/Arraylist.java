package ru.mirea.task13;
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<String>();
        games.add("WOW");
        games.add("Dota");
        games.add("Cs");
        games.add("Graveyard keeper");
        games.add(3, "Stardew valley");
        System.out.println(games.get(0));
        games.set(2, "Overwatch");
        System.out.printf("В списке %d элементов \n",games.size());
        for(String game : games){
            System.out.println(game);
        }
        if(games.contains("Overwatch")){

            System.out.println("В списке есть Overwatch");
        }
        games.remove("Graveyard keeper");
        games.remove(0);
        for(String game : games){

            System.out.println(game);
        }

    }
}

