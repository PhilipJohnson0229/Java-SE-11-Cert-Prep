package com.philipJohnson;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew()
    {
        System.out.println(this.getName() + " is chewing like a dog.");
    }

    @Override
    public void Eat() {
        super.Eat();
        chew();
    }

    public void Walk()
    {
        System.out.println(this.getName() +  " is calling the Walk method");
        Move(5);
    }

    public void Run()
    {
        System.out.println(this.getName() + " is calling the Run method");
        Move(6);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog is moving legs at " + speed);
    }

    @Override
    public void Move(int speed) {
        System.out.println("Dog version of move called");
        moveLegs(5);
        super.Move(speed);

    }
}
