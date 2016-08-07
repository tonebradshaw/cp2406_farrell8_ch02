import java.util.Scanner;

/**
 * Created by tony on 7/08/2016.
 */
public class NauticalMilesInteractive {

    public static void main(String[] args) {

        int nauticalMilesEntered;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number of nautical miles: ");
        nauticalMilesEntered = keyBoard.nextInt();

        Double kilometers = nauticalMilesEntered * 1.852;
        Double miles = nauticalMilesEntered * 1.150779;

        System.out.println(nauticalMilesEntered + " nautical Miles is equal to " + kilometers + " kilometres and " + miles + " miles.");
    }
}
