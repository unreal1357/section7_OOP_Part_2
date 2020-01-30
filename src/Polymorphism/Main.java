package Polymorphism;

//polymorphism example

//Parent class
class Movie {
    private String name;

    public Movie(String name) {

        this.name = name;
    }

    public String plot(){

        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

//Child classes
//they all initalize via the constructor, their own constructor
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot(){
        return ("A shark eats lots of people");
    }
}

class IndependanceDay extends Movie {
    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return ("Aliens attempt to take over planet earth");
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return ("Kids try to escape a maze");
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return ("Jedi's save the galaxy!");
    }
}

class forgetableMovie extends Movie {
    public forgetableMovie() {
        super("Forgetable");
    }
//    no plot method -- no override
}




public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " +movie.plot() + "\n"); //movie.plot is showing how polymorphism work.
//            explained
            /*
            movie.plot is doing a lot of work here, looking at object called movie
            variable that we created that was returned from randomMovie method and going down looking into that object and looking to see if it has a plot method
            for example if Jaws is picked, it looks in that class to see if there is a plot method, and prints out that version of plot for the new object
            that is created when its initalized when its class is called by the random number generator method

            with movie.plot we are assigning different functionality depening on type of object that we have created. -- this is polymorphism

            something interesting happens when calling forgetable movie, set it to have no plot, when java looks it sees then then moves to the parent class which has
            the plot method and by default returns "no plot here"
             */
        }

    }
//returning superclass - movie, can use this once to apply to all child classes
    public static Movie randomMovie() { //calls move class type so it can include all its children (the movie)
        int randomNumber = (int) (Math.random() * 5) + 1; //returns range in range of between 1-5
        System.out.println("Random number generated was: " + randomNumber);
//        dont need to break because its returning a value, would need to otherwise
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new forgetableMovie();
            default:
                return null;
        }
    }
}
