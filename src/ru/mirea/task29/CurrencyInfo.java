package ru.mirea.task29;

import java.io.Serializable;
import java.util.List;

public class CurrencyInfo implements Serializable {
    public String name;
    public String state;
    public  List<String> users;

    public CurrencyInfo(String name, String state, List<String> users) {
        this.name = name;
        this.state = state;
        this.users = users;
    }
    public String getState() {
        return this.state;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setState(String state){
        this.state = name;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", users=" + users +
                '}';
    }
}

