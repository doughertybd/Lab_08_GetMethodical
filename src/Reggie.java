import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCM = "";
        String menu = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("\nYour SSN is " +SSN);
        UCM = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{8}");
        System.out.println("\nYour UC M number is " +UCM);
        menu = SafeInput.getRegExString(in, "Would you like to Open, Save, View, or Quit?", "[OoSsVvQq]");
        switch(menu)
        {
            case "O":
            case "o":
                System.out.println("Opening");
                break;
            case "S":
            case "s":
                System.out.println("Saving");
                break;
            case "V":
            case "v":
                System.out.println("Viewing");
                break;
            case "Q":
            case "q":
                System.out.println("Quitting");
                break;
        }
    }
}
