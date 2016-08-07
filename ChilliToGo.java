import java.util.Scanner;

/**
 * Created by tony on 8/08/2016.
 */
public class ChilliToGo {

    public static void main(String[] args) {

        int numberOfAdults;
        int numberOfChildren;

        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number of adults: ");
        numberOfAdults = keyBoard.nextInt();

        keyBoard = new Scanner(System.in);
        System.out.print("Enter number of children: ");
        numberOfChildren = keyBoard.nextInt();

        double totalCost = numberOfAdults * 7 + numberOfChildren * 4;

        System.out.println("Welcome to the Huntington Boys and Girls Club. " +
                "You have ordered " + numberOfAdults + " adult meals at $7 each and " + numberOfChildren +
                " children's meals at $4 each. The cost of your order is $" + String.format("%.2f", totalCost) + ".");
    }
}
