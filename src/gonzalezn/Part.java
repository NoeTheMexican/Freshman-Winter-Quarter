/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/12/2016
 */
package gonzalezn;
/*
 * Interface allows for multiple parts to be used with multiple different methods.
 */
public interface Part {
    double getCost();

    String getName();

    double getWeight();

    void printBillOfMaterials();
}
