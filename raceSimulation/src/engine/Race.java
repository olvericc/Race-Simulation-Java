package engine;

import entities.Car;
import entities.Vehicle;
import utils.Printer;
import utils.Progress;

public class Race
{
    private Vehicle firstVehicle;
    private Vehicle secondVehicle;
    private final int rDistance;
    private int wPlayerOne;
    private int wPlayerTwo;
    private int tiesQuantity;
    public Race(int distance)
    {
        this.tiesQuantity = 0;
        this.firstVehicle = new Car();
        this.secondVehicle = new Car();
        this.rDistance = distance;
        this.wPlayerOne = 0;
        this.wPlayerTwo = 0;
    }
    public void initRace()
    {
        firstVehicle = new Car();
        secondVehicle = new Car();

        firstVehicle.moveSimulation();
        secondVehicle.moveSimulation();

        while (firstVehicle.getvDistance() < rDistance && secondVehicle.getvDistance() < rDistance)
        {
            firstVehicle.moveSimulation();
            secondVehicle.moveSimulation();
        }

        Progress.clearConsole();

        Printer.printL("The race is in progress:");
        Printer.printTrace();
        Printer.printL("Player One:" + firstVehicle.getPresentation());
        Printer.printL("Player Two:" + secondVehicle.getPresentation());
        Printer.printTrace();

        Progress.loading();

        Progress.clearConsole();

        if (firstVehicle.getvDistance() >= rDistance && secondVehicle.getvDistance() >= rDistance)
        {
            Printer.printL("Tie!");
            tiesQuantity++;
        }
        else if (firstVehicle.getvDistance() >= rDistance)
        {
            Printer.printL("\n> The car number one won the race! Congratulations.");
            wPlayerOne++;
        }
        else
        {
            Printer.printL("\n> The car number two won the race! Congratulations.");
            wPlayerTwo++;
        }
    }
    public int getTiesQuantity()
    {
        return tiesQuantity;
    }
    public int getwPlayerOne()
    {
        return wPlayerOne;
    }
    public int getwPlayerTwo()
    {
        return wPlayerTwo;
    }
}