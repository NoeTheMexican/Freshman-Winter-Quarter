/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;
/*
 * This class is used to create a sheet metal object
 * with multiple different sizes. Allows to create different
 * object that use sheet metals.
 */
public class SheetMetal implements Part {
    final double LBS_MULTIPLIER = 0.1;
    final double USD_MULTIPLIER = 0.50;
    double lengthInches;
    double thicknessInches;
    double widthInches;
    String name;

    public SheetMetal(double lengthInches, double thicknessInches, double widthInches) {
        this.lengthInches = lengthInches;
        this.thicknessInches = thicknessInches;
        this.widthInches = widthInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * lengthInches * thicknessInches * widthInches;
    }

    @Override
    public String getName() {
        return (lengthInches 
                + "x" + thicknessInches 
                + "x" + widthInches
                + " Sheet");
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * lengthInches * thicknessInches * widthInches;
    }

    @Override
    public void printBillOfMaterials() {

    }

}
