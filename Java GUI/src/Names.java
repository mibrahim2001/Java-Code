import javax.swing.*;
import java.awt.*;

public class Names extends JFrame {
    private final JLabel name1;
    private final JLabel name2;
    private final JLabel name3;
    private final JLabel name4;

    private final Box vBox;

    public Names(){
        super("Names");
        setTitle("Talha my son");
        setLayout(new FlowLayout());

        vBox = Box.createVerticalBox();
        add(vBox);

        name1 = new JLabel("Talha");
        name2 = new JLabel("Ali");
        name3 = new JLabel("Umer");
        name4 = new JLabel("Ibrahim");

        vBox.add(name1);
        vBox.add(name2);
        vBox.add(name3);
        vBox.add(name4);

    }

    public static void main(String[] args) {
        Names name = new Names();
        name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name.setSize(1000,700);
        name.setVisible(true);
    }

}
