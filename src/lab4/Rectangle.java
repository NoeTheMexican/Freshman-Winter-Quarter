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
 * Draws a rectangle using an xy coordinate system.
 * Used to create the tree trunk.
 */
public class Rectangle extends Shape {
    protected double height;
    protected double width;
    public Rectangle(double x, 
                     double y,
                     double width,
                     double height,
                     Color color) {
        super(x,y,color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(WinPlotter plotter) {
        setPenColor(plotter);
        plotter.moveTo(x, y);
        plotter.drawTo(x+width, y);
        plotter.drawTo(width+x, height+y);
        plotter.drawTo(x, height+y);
        plotter.drawTo(x, y);
        
    }
}
