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
 * Draws a point at a given x,y coordinate.
 */
public class Point extends Shape {

    public Point(double x,
                 double y,
                 Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(WinPlotter plotter) {
        setPenColor(plotter);
        plotter.drawPoint(x, y);

    }

}
