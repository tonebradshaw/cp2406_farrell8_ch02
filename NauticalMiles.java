/**
 * Created by tony on 7/08/2016.
 */
public class NauticalMiles {

    public static void main(String[] args) {

        Double nauticalMile = 751.0;
        Double kilometers = nauticalMile * 1.852;
        Double miles = nauticalMile * 1.150779;

        System.out.println(nauticalMile + " nautical Miles is equal to " + kilometers + " kilometres and " + miles + " miles.");
    }


}
