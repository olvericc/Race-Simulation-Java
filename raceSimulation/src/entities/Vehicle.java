package entities;

import java.util.Random;

public class Vehicle
{
    private int vDistance;
    private int vSpeed;
    public Vehicle()
    {
        vSpeed = 0;
    }
    public void moveSimulation()
    {
        Random random = new Random();
        vSpeed = random.nextInt(3) + 1;
        vDistance += vSpeed;
    }
    public int getvDistance()
    {
        return vDistance;
    }
    public int getvSpeed()
    {
        return vSpeed;
    }
    public String getPresentation()
    {
        return " ".repeat(Math.max(0, vDistance)) + "#";
    }
}