/*
 * SE1021
 * Winter 2016-2017
 * Lab 4
 * Name: Noe Gonzalez
 * Created: 1/11/2017
 */
package lab4;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;
/*
 * Extends the triangle class and uses the methods within it to draw
 * the triangle. This class includes a label in order to create presents 
 * in the shape of triangles.
 */
public class LabeledTriangle extends Triangle {
    String presentLabel;
    public LabeledTriangle(double x, 
                           double y,
                           double base,
                           double height,
                           Color color,
                           String presentLabel) {
        super(x,y,base, height, color);
        this.presentLabel = presentLabel;
    }

    @Override
    public void draw(WinPlotter plotter) {
        super.draw(plotter);
        //the 5 and the 2 are used to center the label on the triangle.
        double labelX = x+5;
        double labelY = y+2;
        plotter.printAt(labelX, labelY, presentLabel);
        
    }

}
