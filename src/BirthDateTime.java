import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        year = SafeInput.getRangedInt(in, "Enter your birth year: ", 1950,2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month: ", 1,12);
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1,31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1,30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1,29);
        }
        hours = SafeInput.getRangedInt(in, "Enter your birth hour: ", 1,24);
        minutes = SafeInput.getRangedInt(in, "Enter your birth minute: ", 1,59);
        System.out.println("\nYou were born at " +hours+ ":" +minutes+ " on " +month+ "/" +day+ "/" +year);


    }
}
