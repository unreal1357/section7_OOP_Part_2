package PolymorphismChallenge;

class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "this car type is unknown";
    }

    public String accelerate(){
        return "null";
    }

    public String brake(){
        return "null";
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + (" starting Engine");
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + (" is accelerating");
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + (" is braking");
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return ("Starting Ford Engine");
    }

    @Override
    public String accelerate() {
        return ("Ford is accelerating");
    }

    @Override
    public String brake() {
        return ("Ford is breaking");
    }
}

class Honda extends Car {
    public Honda(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return ("Starting Honda Engine");
    }

    @Override
    public String accelerate() {
        return ("Honda is accelerating");
    }

    @Override
    public String brake() {
        return ("Honda is breaking");
    }
}

class Unknown extends Car {
    public Unknown() {
        super("unknown", 4);
    }
}


    public class Main {
        public static void main(String[] args) {


            Car car = new Car("Base Car", 8);
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            Tesla tesla = new Tesla(12, "Roadster");
            System.out.println(tesla.startEngine());
            System.out.println(tesla.accelerate());
            System.out.println(tesla.brake());

//
//            for(int i = 1; i<11; i++) {
//                Car car = randomCar();
//                System.out.println("car #" + i + " : " + car.getName() +
//                        "\n" + car.startEngine());
//            }

//            Tesla tesla = new Tesla();
//            System.out.println(tesla.startEngine());
//            System.out.println(tesla.getName());
//            System.out.println(tesla.getWheels() + " wheels");
//
//            Unknown unknown = new Unknown();
//            System.out.println(unknown.startEngine());
//            System.out.println(unknown.getName());
//            System.out.println(unknown.getWheels() + " wheels");
        }

//        public static Car randomCar() {
//            int randomNumber = (int) (Math.random() * 4) + 1;
//            System.out.println("Random number generated was: " + randomNumber);
//
//            switch (randomNumber) {
//                case 1:
//                    return new Ford();
//                case 2:
//                    return new Tesla();
//                case 3:
//                    return new Honda();
//                case 4:
//                    return new Unknown();
//                default:
//                    return null;
//            }
//        }
    }

