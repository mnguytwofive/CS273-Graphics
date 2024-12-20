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
        
        /** Importance: I added new notes such as // START OF SECTION and // END OF SECTION
         * and revised other notes to clearly mark the areas in which students need to write
         * code for the checkpoint due to the method that I have created (explained in drawBorder method)
         * 
         * Justification and Context: Generally speaking, the words that "pop" out often times are the ones
         * in all caps due to human psychology in perceiving larger text as more important. 
         * Taking this into consideration, // START OF SECTION and // END OF SECTION are in all caps to
         * make it more apparent so that when students begin reading the code and understanding 
         * code structure (presummingly), they will know right off the bat the lines in which
         * they should modify code so that they don't accidently modify important parts of code
         * that are responsible for overall structure and display of program. In addition,
         * the helper method is deliberately placed after the 'paint' method so the first thing
         * students see are these markers, making it clear where to focus their changes.
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
        
        
        /** 
         * Context: According to Lab 3, checkpoint 2, the boxes are to be drawn in a white background.
         * This means that no pixel outside of the boxes are to be a color other than white.
         * 
         * Justification:  Calling the `drawBorder` method before the background is set to white would 
         * overwrite the border with the white background, meaning that the border won't be displayed
         * on the screen; it'll be completely covered. Therefore, in order to display my implementation, we need
         * to call the method at the end (line 76), ensuring that borders remain visible even after execution of
         * user graphics. This addresses an issue in the code flow and provides the rationale for why the method, 
         * 'drawBorder', is placed at the end.
         * 
         * Importance: This will ensure that when students work on this checkpoint, they can test boxes
         * without worrying about the border and cause any bugs/errors to occur due to overlap with 
         * graphics, improving the student learning experience.
         *
         */
        // END OF SECTION
        drawBorder(g);
        
    }//paint
    
    /** Context: Lab 3 introduces a new topic known as Graphics to students taking the introduction
     * to CS course. Students are tasked to solve checkpoints that emphasize the importance of
     * coordinate systems to create 2-D art based on question prompt requirements.
     * In Lab 3, checkpoint 2, students will be asked to modify this code to create three 
     * concentric, filled-in boxes (any size) whereas the inner box should be green; the middle box should be red; 
     * the outer box should be blue. All boxes should be drawn on a white background. The issue is that students
     * have to do a lot of guessing about coordinates since they don't have visual references. They will need to understand
     * the coordinate axes (i.e., origin at top-left, x increases to the right, y increases down) to succeed in this lab.
     * Some common pitfalls are miscalculating size and position of boxes in relation to each other that
     * in return makes graphic appear as unintended. 
     * 
     * Importance: This helper method displays borders on the screen with text demonstrating the label of origin, X-axis,
     * and Y-axis with the color magenta. This will help students understand coordinate axes such as where (0,0), 
     * (600,0), and (0,600) are positioned so that when students begin writing graphics for specific coordinates,
     * they'll have a clearer idea of where it'll be positioned conceptually. Understanding the positions of the
     * boxes and their relationship to the coordinate axes will help students in positioning shapes 
     * accurately for the lab checkpoints. 
     * 
     * Justification: The color used -- magenta, is distinct from the colors
     * required in the lab. It was carefully selected so that students can distinguish these different colors to 
     * differentiate the borders and the three concentric boxes (Blue, Red, Green) that are required for the lab.
     * 
     * Justification: This code is in a separate method because it's not code that students
     * are supposed to modify for the checkpoint. It also makes it less confusing for students because the 
     * method contains many lines of code that are similar to what the students are assigned to
     * implement.
     * 
     * Importance: By providing a visual reference of the coordinate axes, students will be able to directly
     * relate the (x, y) values to the position of the boxes they will draw in later parts of the lab. This
     * reinforces their understanding of coordinate systems and prepares them for the next checkpoints in which they
     * will apply these principles on more challenging problems. This will be useful for instructors and TAs,
     * as the way this code is structured enables them to quickly check the students' understanding of 
     * coordinate systems and their ability to manipulate graphical elements. This will reduce technical
     * debt by providing students with information necessary to understand coordinate systems in a concrete level
     * through method implemenation and explanation, making it less likely that they will need to ask related 
     * questions or rebuttals during office hours. In return, the workflow of TAs' and faculty will be more
     * efficient and they can prioritize other needs. Lastly, this prepares students that are interested
     * in careers such as but not limited to: game development, scientific visualization, and robotics 
     * -- where proficiency in coordinate-based programming is essential for success.
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
