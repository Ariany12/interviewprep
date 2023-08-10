package org.learn;

public class User {
    private String name;

    public User(){}

    public User(String name , int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sayHello(){
        System.out.println("- Hi, My name is " + name);
    }
}
