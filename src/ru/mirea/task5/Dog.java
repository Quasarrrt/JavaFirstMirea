package ru.mirea.task5;

public abstract class Dog {
    protected String breed;
    protected int age;
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return breed+" is "+age+"yo";
    }
}
