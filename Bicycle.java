public class Bicycle extends Vehicle
{
    private boolean hasBell;

    public Bicycle(int speed, double fuel, boolean hasBell) // constructor
    {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    public void start() // override start method
    {
        System.out.println("The bicycle has started, start pedaling!");
    }

    public void ringBell() // custom method
    {
        if (hasBell)
        {
            System.out.println("Brrring!");
        }
        else
        {
            System.out.println("This bicycle has no bell.");
        }
    }

    public boolean getHasBell() // getter for hasBell
    {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) // setter for hasBell
    {
        this.hasBell = hasBell;
    }
}