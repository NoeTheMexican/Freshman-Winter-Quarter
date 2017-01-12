/*
 * SE1021 - 051
 * Winter 2015-2016
 * Lab 2 - Interfaces
 * Name: Phileas Fogg
 * Created: 12/7/2016
 */
package gonzalezn;

/**
 * @author Dr. Josiah Yoder
 * @version 1.0
 */
public class MachineDriver {
    /**
     * A simple example driver class for the Bill of Materials generator lab.
     *
     * This example describes the materials needed to build a cube by bolting
     * together six pieces of sheet metal.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        Bolt bolt = new Bolt(0.25,2);
        Nut nut = new Nut(0.25);
        SheetMetal sheet = new SheetMetal(12,12,0.25);

        Duplicate sides  = new Duplicate(sheet,6);

        Assembly nutBoltCombo = new Assembly("Nut-Bolt Pair");
        nutBoltCombo.addPart(bolt);
        nutBoltCombo.addPart(nut);

        Duplicate nutsAndBolts = new Duplicate(nutBoltCombo,36);

        Assembly cube = new Assembly("Cube");
        cube.addPart(nutsAndBolts);
        cube.addPart(sides);

        cube.printBillOfMaterials();
    }
}