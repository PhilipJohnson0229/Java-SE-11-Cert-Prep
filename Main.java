package com.philipJohnson;

public class Main {

    public static  void main(String[] args)
    {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie", 20, 10, 2, 4, 1, 20, "Short");
        dog.Eat();
    }
}
