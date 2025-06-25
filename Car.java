public class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(int speed, double fuel, int numberOfDoors) // constructor
    {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    public void start() // override start method
    {
        System.out.println("The car has started, ready to drive!");
    }

    public void honk() // custom method
    {
        System.out.println("Beep!");
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

}