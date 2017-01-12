/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;
/*
 * Allows to create a duplicate of any single part, along with a slight fee for creating a duplicate.
 */
public class Duplicate implements Part {
    final double USD_PER_DUPLICATE = .10;
    int numDuplicates;
    Part identicalPart;
    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    @Override
    public double getCost() {
        return (identicalPart.getCost() 
                * numDuplicates) 
                + (USD_PER_DUPLICATE 
                * numDuplicates);
    }
    
    @Override
    public String getName() {
        return numDuplicates 
                + " " 
                + identicalPart.getName();
    }

    @Override
    public double getWeight() {
        return (identicalPart.getWeight() * numDuplicates);
    }
    /**
     * Print Bill Of Materials prints out the total cost 
     * and weight for the total amount of duplicates.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.print("==========================\n"
                           +numDuplicates+" "
                           +identicalPart.getName()
                           +"s\n==========================\n"
                           + "Duplicate Part: "+identicalPart.getName()
                           +"\nCopies: " +numDuplicates
                           +"\nIndividual Cost: $");
                           System.out.format("%.2f%n", identicalPart.getCost());
                           System.out.print("Individual Weight: ");
                           System.out.format("%.3f",identicalPart.getWeight());
                           System.out.print(" lbs\n\nTotal Cost: $");
                           System.out.format("%.2f",getCost());
                           System.out.print("\nTotal Weight: ");
                           System.out.format("%.3f",getWeight());
                           System.out.println(" lbs");
        identicalPart.printBillOfMaterials();
                                         
    }

}
