import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class ButtonChase extends JFrame{

    //declaring variables
    private final JButton button;
    Random rand = new Random();

    //main method
    public static void main(String[] args) {
        ButtonChase buttonChase = new ButtonChase();
        buttonChase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonChase.setSize(1080,720);
        buttonChase.setVisible(true);
    }

    //constructor
    public ButtonChase(){
        super("Button Chase");
        setLayout(null);

        //creating a JPanel to place button on it
        JPanel panel = new JPanel();
        //creating a rectangle panel with some width and height
        panel.setBounds(new Rectangle(1250,720));
        add(panel);

        //creating a button and setting its label
        button = new JButton("Touch Me Not");
        panel.add(button);


        button.addMouseListener(
                //using anonymous inner class to handle event
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                        /* taking x and y component with a random value and an upper bound
                           that is equal to the width of the panel minus the width or height
                            of button so that it stays  in the frame */

                        int x = rand.nextInt(panel.getWidth()-150);
                        int y = rand.nextInt(panel.getHeight()-50);

                        /*Changing the bounds of button on panel whenever the cursor enters it*/
                        button.setBounds(x,y,125,50);

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                }
        );


    }
}
