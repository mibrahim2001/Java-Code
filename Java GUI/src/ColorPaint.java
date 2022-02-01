import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ColorPaint extends JFrame{

    private int xComponent = -10;
    private int yComponent = -10;
    private Color color = Color.BLACK;

    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;



    public ColorPaint(){

        super("Paint");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        button1 = new JButton("RED");
        button1.setBackground(Color.RED);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button3 = new JButton("YELLOW");
        button3.setBackground(Color.yellow);

        button2 = new JButton("GREEN");
        button2.setBackground(Color.GREEN);

        button4 = new JButton("BLACK");
        button4.setBackground(Color.BLACK);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        myActionHandler handler = new myActionHandler();

        button1.addActionListener(handler);
        button3.addActionListener(handler);
        button2.addActionListener(handler);
        button4.addActionListener(handler);


        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(panel,BorderLayout.EAST);

        container.addMouseMotionListener(
                new MouseMotionListener() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        xComponent = e.getX();
                        yComponent = e.getY();
                        repaint();
                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {

                    }
                }
        );

    }

    private class myActionHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String act = e.getActionCommand();
            if (e.getSource() == button1) {
                color = Color.RED;
            } else if (e.getSource() == button2) {
                color = Color.GREEN;
            } else if (e.getSource() == button3) {
                color = Color.yellow;
            } else {
                color = Color.BLACK;
            }
        }
    }


    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(xComponent,yComponent,10,10);
    }


}
