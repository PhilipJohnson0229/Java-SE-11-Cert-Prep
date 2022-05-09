package com.philipJohnson;



class Movie
{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String Plot()
    {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie
{
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String Plot()
    {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie
{
    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String Plot()
    {
        return "Aliens attack new york I think";
    }
}

class Avengers extends Movie
{
    public Avengers() {
        super("Avengers");
    }
    @Override
    public String Plot()
    {
        return "Earths mightiest heroes!";
    }
}

class ForgettableMovie extends Movie
{
    public ForgettableMovie() {
        super("Forgettable Movie");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 11; i++)
        {
            Movie movie = RandomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
                    + "Plot: " + movie.Plot() + "\n");
        }
    }

    public static Movie RandomMovie()
    {
        //have to cast as int because random() method returns double
        int randomNumber = (int)(Math.random() * 4) + 1;
        System.out.println("Random number generated as " + randomNumber);

        switch(randomNumber)
        {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Avengers();

            case 4:
                return new ForgettableMovie();

        }

        return null;
    }
}