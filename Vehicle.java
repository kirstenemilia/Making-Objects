public class Vehicle 
{
    protected int speed;
    protected double fuel;

    public Vehicle(int speed, double fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start() // method to start vehicle
    {
        System.out.println("The vehicle has started.");
    }

    public void stop() // method to stop vehicle
    {
        System.out.println("The vehicle has stopped.");
    }

    public final void displayFuel() // method to display fuel
    {
        System.out.println("Fuel level: " + fuel + " liters.");
    }

    public double getFuel() 
    {
        return fuel;
    }

    public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

}