public class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car(100, 30.5, 2); //Car object
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println(); // empty line

        Bicycle myBike = new Bicycle(15, 0.0, true); //Bicycle object
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();

        System.out.println(); // empty line

        System.out.println("Car's fuel level through getter: " + myCar.getFuel());

    }
}