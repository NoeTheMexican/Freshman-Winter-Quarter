/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;
/*
 * Creates a nut object that allows to hold together larger and more complicated
 * constructs.
 */
public class Nut implements Part{
    final double LBS_MULTIPLIER = 0.01;
    final double USD_MULTIPLIER = 0.75;
    double diameterInches;
    
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER 
                * (diameterInches * diameterInches);
    }

    @Override
    public String getName() {
        return diameterInches + " Nut";
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER 
                * (diameterInches * diameterInches);
    }

    @Override
    public void printBillOfMaterials() {
        
    }

}
