/** This program draws concentric Boxes
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;

/** class Boxes
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Boxes extends Canvas
{

    /** the "paint" method, that specifies what to draw on the screen
     * 
     * This method needs to be updated
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);
        
        /** Justification: I added additional notes such as // START OF SECTION
         * and modified other notes to identify areas in which students need to write
         * code for the lab due to the method that I have created (which will be explained
         * below)
         * 
         */
        
        // START OF SECTION
        //These statements draw some boxes, but they are not the boxes you want.
        //Replace them with the correct code in this section. 
        
        g.setColor(Color.white);
        g.fillRect(0,0, 600, 600);
        
        g.setColor(Color.blue);
        g.fillRect(50,50,400,400);
        
        g.setColor(Color.red);
        g.fillRect(100,100,300,300);
        
        g.setColor(Color.green);
        g.fillRect(200,200,100,100);
        
        
        /** Justification: drawBorder (the helper method explained below) will be overwritten by previous code
         * that fills the background with the color white. In order to display my implementation, we need
         * to call the method at the end. In addition, since the code is placed at the end,
         * I wrote // END OF SECTION to serve as a placeholder to identify what section the students 
         * should begin to write and stop writing code.
         *
         */
        // END OF SECTION
        drawBorder(g);
        
    }//paint
    
    /** Context: Students have to do a lot of guessing about coordinates. I do want them to understand the coordinate axes 
     * (i.e., origin at top-left, x increases to the right, y increases down).  
     * 
     * Importance: This method displays borders on the screen with text demonstrating the label of origin, X-axis,
     * and Y-axis with the color magenta. This will help students understand coordinate axes such as where (0,0), 
     * (600,0), and (0,600) are positioned. In addition, the color used -- magenta, is distinct from the colors
     * required in the lab. It was carefully selected so that students can distinguish these different colors to 
     * differentiate the borders and the three concentric boxes that are required for the lab.
     * 
     * Justification: this code is in a separate method because it's not code that students
     * are supposed to modify for the checkpoint. It also makes it less confusing for students because the 
     * method contains many lines of code that are similar to what the students are assigned to
     * implement.
     */
    public void drawBorder(Graphics g)
    {
        
        g.setColor(Color.magenta);
        
        g.drawLine(0, 0, 600, 0); // X-axis
        g.drawLine(1, 1, 1, 600); // Y-axis
        g.fillRect(0,0, 600, 5);
        g.fillRect(0,0, 5, 600);
        
        
        g.drawString("X (600, 0)", 530, 15); // X-axis label
        g.drawString("Y (0, 600)", 5, 560); // Y-axis label
        g.drawString("(0,0)", 5, 15); // Origin label
        
        
    }

    /**
     * main
     *
     * All Java programs start with a method named main.  This class' main
     * method creates the window to display your Java drawing.
     *
     * IMPORTANT:  DO NOT MODIFY THIS METHOD
     */
    public static void main(String[] args)
    {
        //Create a window for this program
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600,600);
 
        //Put an instance of this class in the window frame
        Boxes myContent = new Boxes();
        myContent.setBackground(Color.gray.brighter()); // set background color
        myFrame.getContentPane().add(myContent);
        
        // display the frame
        myFrame.setVisible(true);
        
    }//main


    
}//class Boxes
