/**
 * Created by tony on 7/08/2016.
 */
public class QuartsToGallons {

    public static void main(String[] args) {

        int quartsInAGallon = 4;
        int numberOfQuartsNeeded = 18;

        System.out.println("A job that needss 18 quarts requires " + numberOfQuartsNeeded/quartsInAGallon + " gallons plus "
                            + numberOfQuartsNeeded%quartsInAGallon + " quarts");

    }

}
