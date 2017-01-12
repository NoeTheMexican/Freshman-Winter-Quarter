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
 * This astract class is used to have certain functions present throughout 
 * every single class this is seen in setPenColor and draw.
 */
public abstract class Shape {
    protected Color color;
    protected double x;
    protected double y;
    Shape(double x,
          double y,
          Color color){
        this.color = color;
        this.x = x;
        this.y = y;
    }
    abstract void draw(WinPlotter plotter);
    
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPenColor(WinPlotter plotter){
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        plotter.setPenColor(red,green,blue);
    }
    
}
