import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Painter extends JPanel implements MouseMotionListener, ActionListener {
    //declaring variables to use
    private int x;
    private int y;
    private Color col;

    //Main method
    public static void main(String[] args) {
        Painter painter = new Painter();
        JFrame frame = new JFrame("MS Paint");
        frame.add(painter);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080,720);
        frame.setVisible(true);
    }

    //constructor
    public Painter(){
        setLayout(new BorderLayout());

        //taking a JPanel to show color buttons
        JPanel panel = new JPanel(new GridLayout(1,4));

        JButton red = new JButton("red");
        red.setBackground(Color.RED);

        JButton blue = new JButton("blue");
        blue.setBackground(Color.BLUE);

        JButton yellow = new JButton("yellow");
        yellow.setBackground(Color.YELLOW);

        JButton black = new JButton("black");
        black.setBackground(Color.BLACK);


        //adding the button to the panel
        panel.add(red);
        panel.add(yellow);
        panel.add(blue);
        panel.add(black);

        //adding action listener to these buttons
        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        black.addActionListener(this);

        //adding panel to the parent panel
        JLabel instruction = new JLabel("Drag to draw",JLabel.RIGHT);
        add(instruction,BorderLayout.SOUTH);
        add(panel,BorderLayout.NORTH);

        //adding a MouseMotionListener to draw on panel
        addMouseMotionListener(this);

    }

    //MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    //ActionListener methods
    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        if(act.equals("red")){
            col = Color.RED;
        }else if(act.equals("blue")){
            col = Color.blue;
        }else if(act.equals("yellow")){
            col = Color.yellow;
        }else{
            col = Color.BLACK;
        }
    }

    //method to draw
    public void paintComponent(Graphics g){
        g.setColor(col);
        g.fillRect(x,y,4,4);
    }

}
