package com.philipJohnson;

public class Animal
{
    private String name;

    private int body;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int body, int brain, int size, int weight) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public void Eat()
    {
        System.out.println(this.name + " made a noise");

    }

    public void Move(int speed)
    {
        System.out.println(this.name + " is calling the moving at " + speed);
    }



    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
