package com.company;

import java.io.Serializable;

public class Person  implements Serializable {
    //private transient static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double height;
    private boolean liveInCity;

    public Person(String n, int a, double h, boolean c){
        name=n;
        age=a;
        height=h;
        liveInCity=c;
    }

    @Override
    public String toString(){
        return "Person{" +
                "Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Height=" + getHeight() +
                ", Live in City=" + getCity() +
                '}';
    }

    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getCity(){return liveInCity;}
}
