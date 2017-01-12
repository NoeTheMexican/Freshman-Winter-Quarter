/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;

import java.util.ArrayList;
/*
 * Can create a construct that uses multiple parts as well
 * as multiple different assemblies.
 */
public class Assembly implements Part {
    String name;
    ArrayList<Part> subPart = new ArrayList<>();
    final double USD_PER_SUB_PART = 0.45;

    public Assembly(String name) {
        this.name = name;
    }

    public void addPart(Part part) {
        subPart.add(part);
    }

    @Override
    public double getCost() {
        double total = 0;
        for (int i = 0; i < subPart.size(); i++) {
            total += (subPart.get(i).getCost() + .45);
        }
        return total;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < subPart.size(); i++) {
            weight += subPart.get(i).getWeight();
        }
        return weight;
    }
    /**
     * print bill of materials will print out the total cost and weight for each assembly, 
     * including larger assemblies made of smaller assemblies.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" 
                 + name + "\n==========================");
        for (int i = 0; i < subPart.size(); i++) {
            System.out.print("Part: "+ subPart.get(i).getName() + "\n" + "Cost: $");
            System.out.format("%.2f",subPart.get(i).getCost());
            System.out.print("\nWeight: "); 
            System.out.format("%.3f",subPart.get(i).getWeight());
            System.out.println(" lbs \n");
        }
        System.out.print("Total Cost: $");
        System.out.format("%.2f", getCost());
        System.out.print("\nTotal Weight: ");
        System.out.format("%.3f", getWeight());
        System.out.println(" lbs\n");
        
        for (int i = 0; i < subPart.size(); i++) {
            subPart.get(i).printBillOfMaterials();

        }

    }

}
