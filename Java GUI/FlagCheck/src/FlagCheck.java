import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;
import java.awt.*;
import java.awt.event.*;

public class FlagCheck extends JFrame {


    private final JPanel mousePanel;
    private final JLabel flag1;
    private final JLabel flag2;
    private final JLabel flag3;
    private final JLabel flag4;
    private final JLabel flag5;
    private final JLabel text1;
    private  Box vBox;

    Icon icon1 = new ImageIcon(getClass().getResource("pakistan.png"));
    Icon icon2 = new ImageIcon(getClass().getResource("uae.jpg"));
    Icon icon3 = new ImageIcon(getClass().getResource("usa.jpg"));
    Icon icon4 = new ImageIcon(getClass().getResource("australia.png"));
    Icon icon5 = new ImageIcon(getClass().getResource("lgbtq.png"));

    Icon gay = new ImageIcon(getClass().getResource("whygae.gif"));

    public FlagCheck(){
        super("Flags");
        setLayout(new FlowLayout());




        mousePanel = new JPanel();

        vBox = Box.createHorizontalBox();
        add(vBox);


        flag1 = new JLabel(icon1);
        flag1.setSize(100,50);
        flag1.setBorder(new EmptyBorder(300,20,0,0));
        vBox.add(flag1);

        text1 = new JLabel("Pakistan");




        flag2 = new JLabel(icon2);
        flag2.setSize(100,50);
        flag2.setBorder(new EmptyBorder(300,20,0,0));
        vBox.add(flag2);



        flag3 = new JLabel(icon3);
        flag3.setSize(100,50);
        flag3.setBorder(new EmptyBorder(300,20,0,0));
        vBox.add(flag3);



        flag4 = new JLabel(icon4);
        flag4.setSize(100,50);
        flag4.setBorder(new EmptyBorder(300,20,0,0));
        vBox.add(flag4);



        flag5 = new JLabel(icon5);
        flag5.setSize(100,50);
        flag5.setBorder(new EmptyBorder(300,20,0,0));
        vBox.add(flag5);


        MouseHandler handler = new MouseHandler();
        flag1.addMouseListener(handler);
        flag2.addMouseListener(handler);
        flag3.addMouseListener(handler);
        flag4.addMouseListener(handler);
        flag5.addMouseListener(handler);


    }
    private class MouseHandler implements  MouseListener{

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
        public void mouseEntered(MouseEvent event) {
            Icon invisible = new ImageIcon(getClass().getResource("invisible.png"));
            if(event.getSource() == flag1){
                flag1.setIcon(invisible);
                flag1.setText("Pakistan");
                flag1.setFont(new Font("Serif",Font.BOLD,20));
                flag1.setHorizontalAlignment(SwingConstants.CENTER);
            }
            else if(event.getSource() == flag2){
                flag2.setIcon(invisible);
                flag2.setText("UAE");
                flag2.setFont(new Font("Serif",Font.BOLD,20));
                flag2.setHorizontalAlignment(SwingConstants.CENTER);
            }
            else if(event.getSource() == flag3){
                flag3.setIcon(invisible);
                flag3.setText("USA");
                flag3.setFont(new Font("Serif",Font.BOLD,20));
                flag3.setHorizontalAlignment(SwingConstants.CENTER);
            }
            else if(event.getSource() == flag4){
                flag4.setIcon(invisible);
                flag4.setText("Australia");
                flag4.setHorizontalAlignment(SwingConstants.CENTER);
                flag4.setVerticalAlignment(SwingConstants.CENTER);
                flag4.setFont(new Font("Serif",Font.BOLD,20));

            }
            else if(event.getSource() == flag5){
                flag5.setIcon(gay);
            }
        }

        @Override
        public void mouseExited(MouseEvent event) {
            if(event.getSource() == flag1){
                flag1.setIcon(icon1);
                flag1.setText(null);
            }
            else if(event.getSource() == flag2){
                flag2.setIcon(icon2);
                flag2.setText(null);
            }
            else if(event.getSource() == flag3){
                flag3.setIcon(icon3);
                flag3.setText(null);
            }
            else if(event.getSource() == flag4){
                flag4.setIcon(icon4);
                flag4.setText(null);
            }
            else if(event.getSource() == flag5){
                flag5.setIcon(icon5);
                flag5.setText(null);
            }

        }
    }



}

