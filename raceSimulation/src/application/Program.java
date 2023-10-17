package application;

import engine.Race;
import utils.Printer;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int raceDistance = 50;

        Race race = new Race(raceDistance);

        do
        {
            Printer.showGameMenu();

            int userOption = sc.nextInt();
            sc.nextLine();

            switch (userOption)
            {
                case 1:
                    Printer.printL("Starting the game with one player:");
                    race.initRace();
                    break;
                case 2:
                    Printer.printL("Starting the game with two players:");
                    race.initRace();
                    break;
                case 3:
                    Printer.printL("Previous results:");
                    Printer.printL("Wins by Player 1: " + race.getwPlayerOne());
                    Printer.printL("Wins by Player 2: " + race.getwPlayerTwo());
                    break;
                case 4:
                    Printer.printL("Quantity of ties in previous simulations");
                    Printer.printL("Ties: " + race.getTiesQuantity());
                    break;
                case 5:
                    Printer.printL("Exiting... Goodbye");
                    sc.close();
                    System.exit(0);
                default:
                    Printer.printL("Try again, choose a valid option...");
            }
            Printer.blankSpaces();
        }
        while (true);
    }
}