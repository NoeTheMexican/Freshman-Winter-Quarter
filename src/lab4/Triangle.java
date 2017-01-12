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
 * Draws a triangle using a given x and y point
 */
public class Triangle extends Shape {
    protected double height;
    protected double base;
    public Triangle(double x,
                    double y,
                    double base,
                    double height,
                    Color color) {
        super(x,y,color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(WinPlotter plotter) {
        int halfOfBase = 2;
        setPenColor(plotter);
        plotter.moveTo(x, y);
        plotter.drawTo(((base/halfOfBase)+x), (height+y));
        plotter.drawTo((base+x), y);
        plotter.drawTo(x,y);
        
    }

}
