import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        double totalCost = 0;
        boolean Continue = true;
        do
        {
            cost = SafeInput.getRangedDouble(in, "Enter the cost of the item ", 0.50,9.99);
            Continue = SafeInput.getYNConfirm(in, "Enter another item?");
            totalCost = cost + totalCost;
        } while (Continue == true);
        System.out.printf("\nYour total cost is: " +totalCost);
    }
}
