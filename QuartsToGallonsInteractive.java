import java.util.Scanner;

/**
 * Created by tony on 7/08/2016.
 */
public class QuartsToGallonsInteractive {

    public static void main(String[] args) {

        int quartsEntered;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number of quarts for the painting job: ");
        quartsEntered = keyBoard.nextInt();
        int quartsInAGallon = 4;
        System.out.println("A job that needs " + quartsEntered + " quarts requires " + quartsEntered / quartsInAGallon + " gallons plus "
                + quartsEntered % quartsInAGallon + " quarts");


    }
}
