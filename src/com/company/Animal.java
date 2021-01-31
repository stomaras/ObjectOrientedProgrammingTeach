package com.company;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // we can introduce some behaviours, and we could add some methods for those.
    // For example, all animals have to eat, so we could create a method called eat.

    // These are 2 methods that are unique to all animals
    // All animals have to eat and move on.
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(){

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }





}
