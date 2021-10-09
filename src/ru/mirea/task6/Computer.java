package ru.mirea.task6;

public class Computer implements Priceable, Nameable {
    private int cpuPrice;
    private int motherboardPrice;
    private int ramPrice;
    private String name;
    public void setCpuPrice(int cpuPrice){
        this.cpuPrice=cpuPrice;
    }
    public int getCpuPrice(){
        return cpuPrice;
    }
    public void setMotherboardPrice(int motherboardPrice){
        this.motherboardPrice=motherboardPrice;
    }
    public int getMotherboardPrice(){
        return motherboardPrice;
    }
    public void setRamPrice(int ramPrice){
        this.ramPrice=ramPrice;
    }
    public int getRamPrice(){
        return ramPrice;
    }
    public void setName(String name){
        this.name=name;
    }
    public Computer(int cpuPrice, int motherboardPrice, int ramPrice, String name){
        this.cpuPrice=cpuPrice;
        this.motherboardPrice=motherboardPrice;
        this.ramPrice=ramPrice;
        this.name=name;
    }
    @Override
    public int getPrice()
    {
        return cpuPrice+motherboardPrice+ramPrice;
    }
    @Override
    public String getName(){
        return name;
    }
}
