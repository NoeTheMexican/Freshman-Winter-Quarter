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
 * Extends the Rectangle class, it uses it to draw a rectangle
 * this class simply creates the presents by adding lables to the
 * rectangles
 */
public class LabeledRectangle extends Rectangle {
    String presentLabel;
    public LabeledRectangle(double x,
                            double y, 
                            double base,
                            double height,
                            Color color,
                            String presentLabel) {
        super(x, y, base, height, color);
        this.presentLabel = presentLabel;
    }

    @Override
    public void draw(WinPlotter plotter) {
        super.draw(plotter);
        double labelX = x+5;
        double labelY = y+2;
        plotter.printAt(labelX, labelY, presentLabel);
        
    }

}
