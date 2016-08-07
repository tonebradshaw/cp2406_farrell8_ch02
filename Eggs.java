import java.util.Scanner;

/**
 * Created by tony on 8/08/2016.
 */
public class Eggs {

    public static void main(String[] args) {

        int numberOfEggsEntered;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number of eggs ordered: ");
        numberOfEggsEntered = keyBoard.nextInt();

        Double costPerDozen = 3.25;
        Double costPerSingle = 0.45;
        Double totalCost = numberOfEggsEntered / 12 * costPerDozen + numberOfEggsEntered % 12 * costPerSingle;

        System.out.println("You ordered " + numberOfEggsEntered + " eggs. That's " + numberOfEggsEntered / 12 +
                " dozen at $3.25 per dozen and " + numberOfEggsEntered % 12 + " loose eggs at 45 cents each for " +
                "a total of $" + totalCost);

    }
}
