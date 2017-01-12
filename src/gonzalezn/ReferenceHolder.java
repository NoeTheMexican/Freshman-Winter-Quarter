/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/18/2016
 */
package gonzalezn;

import java.util.ArrayList;
/*
 * The ReferenceHolder class holds all the citations entered by the users.
 */
public class ReferenceHolder{
    ArrayList<Reference> references = new ArrayList<>();
    public void addReference(Reference reference) {
       references.add(reference);     
    }
    /**
     * prints out all the citations the user has entered.
     */
    public void printAllBibtexEntries() {
        for (int i = 0; i < references.size(); i++){
            System.out.println(references.get(i).getBibtexEntry());
            
        }
        
    }

}
/*
1) Where in this design is there an example of aggregation?
Aggregation can be seen in Book and Article with respect to the reference class, it follows the "Has A" 
relationship where both books and articles have references. 
2) Where in this design are there static methods?
The static methods are in the driver and this is due to any changes to the driver should be apparent to every other 
class, this allows for the driver to follow along with changes made by the user by including more references.
3) Why is the myUniqueID attribute read only?
It is read only because it is something that the user should not be able to change, something that is unique to each 
reference and allows for better organization, if the numbers in references went from 2 and skipped to 20 it would cause 
confusion.
*/