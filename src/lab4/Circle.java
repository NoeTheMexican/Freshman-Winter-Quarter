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
 * This class extends the Shape abstract class and uses WinPlotter
 * to draw a circle using radians, cosine and sine.
 */
public class Circle extends Shape{
    double radius;
    public Circle(double x, 
                  double y, 
                  double radius, 
                  Color color) {
        super(x, y, color);
        this.radius = radius;
    }
    /**
     * Uses sine and cosine to draw a circle using 26 different straight lines.
     */
    public void draw(WinPlotter plotter) {
        int totalSegments = 25;
        int degreesPerCircle = 360;
        double degreesPerSegment = (double)degreesPerCircle 
                                 / (double)totalSegments;
        double radiansPerSegment = Math.toRadians(degreesPerSegment);
        double leftmostXValue = x-radius;
        double totalRadians;
        setPenColor(plotter);
        plotter.moveTo(leftmostXValue, y);
        for(int i = 0; i < totalSegments; i++){
            totalRadians = Math.PI + (radiansPerSegment * i);
            plotter.drawTo(
            (Math.cos(totalRadians)*radius)+x,
            (Math.sin(totalRadians)*radius)+y);
        }
        plotter.drawTo(
        (Math.cos(Math.PI+radiansPerSegment)*radius)+x,
        (Math.sin(Math.PI+radiansPerSegment)*radius)+y);
    }

}
