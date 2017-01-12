/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;
/*
 * Allows to create bolt objects to hold together
 * the constructs.
 */
public class Bolt implements Part {
    double diameterInches;
    double lengthInches;
    final double LBS_MULTIPLIER = 0.05;
    final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER 
                * (diameterInches * lengthInches);
    }

    @Override
    public String getName() {
        return diameterInches + "x" + lengthInches + " Bolt";
    }

    @Override
    public double getWeight() {
        return  LBS_MULTIPLIER 
                * lengthInches
                * (diameterInches * diameterInches);
    }

    @Override
    public void printBillOfMaterials() {

    }

}
