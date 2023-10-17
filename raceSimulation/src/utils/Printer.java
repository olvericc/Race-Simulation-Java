package utils;

public class Printer
{
    public static void printL (String args)
    {
        System.out.println(args);
    }
    public static void printTrace ()
    {
        System.out.println("-----------------------------------------------------------------");
    }
    public static void blankSpaces ()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void showGameMenu ()
    {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";

        System.out.println("╔═════════════════ Game Menu ═════════════════╗");
        System.out.println("║ " + ANSI_CYAN + "1. One Player" + ANSI_RESET + "                               ║");
        System.out.println("║ " + ANSI_CYAN + "2. Two Players" + ANSI_RESET + "                              ║");
        System.out.println("║ " + ANSI_GREEN + "3. Show Previous Results" + ANSI_RESET + "                    ║");
        System.out.println("║ " + ANSI_GREEN + "4. Show Ties Quantity" + ANSI_RESET + "                       ║");
        System.out.println("║ " + ANSI_RED + "5. Quit" + ANSI_RESET + "                                     ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.print("Choose an option: ");
    }
}