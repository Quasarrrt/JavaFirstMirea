package ru.mirea.task15;

import java.io.*;


public class Text {
    public static void read(String path) {
        try(FileReader reader = new FileReader( path))
        {
            System.out.println("Текст в файле:");
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
            System.out.println('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void write(String path) {
        try (FileWriter writer = new FileWriter(path, false))
        {
            System.out.println("Введите текст:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();
            writer.write(text);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

         String path="D:\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt";
         //task 1
        write(path);
        //task 2
        read(path);
        //task 3
        write(path);
        read(path);
        //task 4
        try(FileWriter writer = new FileWriter( path, true))
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текст для добавления в конец файла:");
            String text = reader.readLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        read(path);
    }

}

