import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by tony on 8/08/2016.
 */
public class ChilliToGoProfit {

    public static void main(String[] args) {

        int numberOfAdults;
        int numberOfChildren;

        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number of adults: ");
        numberOfAdults = keyBoard.nextInt();

        keyBoard = new Scanner(System.in);
        System.out.print("Enter number of children: ");
        numberOfChildren = keyBoard.nextInt();

        double profitOnAdultMeals = 7 - 4.35;
        double profitOnChildMeals = 4 - 3.10;
        double totalProfitOnAdultMeals = profitOnAdultMeals * numberOfAdults;
        double totalProfitOnChildMeals = profitOnChildMeals * numberOfChildren;
        double totalProfitOnAllMeals = totalProfitOnAdultMeals + totalProfitOnChildMeals;
        double totalCost = numberOfAdults * 7 + numberOfChildren * 4;

        System.out.println("Welcome to the Huntington Boys and Girls Club. " +
                "You have ordered " + numberOfAdults + " adult meals at $7 each and " + numberOfChildren +
                " children's meals at $4 each. The cost of your order is $" + String.format("%.2f", totalCost) + ".");
        System.out.println("That will give us a profit on adult meals of $" + String.format("%.2f", totalProfitOnAdultMeals) +
                " and a profit on child meals of $" + String.format("%.2f", totalProfitOnChildMeals) + " adding to a grand total of $" +
                String.format("%.2f", totalProfitOnAllMeals) + " for all meals.\nThank you for your support.");
    }
}
