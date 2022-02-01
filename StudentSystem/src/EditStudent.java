import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class EditStudent extends JFrame {

    //declaring variables that will be used in this frame
    private int editID;

    private final JLabel editStudent;
    private final JLabel nameLabel;
    private final JLabel genderLabel;
    private final JLabel ageLabel;

    private final JTextField nameField;
    private final JComboBox genderCombo;
    private final JTextField ageField;

    private final JButton editButton;

    private final Box vBoxParent;

    //creating a list to pass to the gender combo box
    String[] genderList = new String[]{"Male","Female","Prefer not say"};

    public EditStudent() {
        super("Add Student");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,1000);

        //taking the search id from the user
        editID = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the id to edit"));

        // adding a parent vBox to the frame
        vBoxParent = Box.createVerticalBox();
        add(vBoxParent);

        //adding the title to vBox
        editStudent = new JLabel("Edit Record");
        editStudent.setFont(new Font("Verdana", Font.BOLD, 28));
        vBoxParent.add(editStudent);

        /*Creating multiple horizontal boxes in the parent vertical box to place the label and field
         * in a single horizontal line and setBorder method is used here to give padding between the
         * horizontal boxes containing the fields*/

        Box hBox2 = Box.createHorizontalBox();
        hBox2.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox2);
        nameLabel = new JLabel("Name: ");
        hBox2.add(nameLabel);
        nameField = new JTextField(12);
        hBox2.add(nameField);

        Box hBox3 = Box.createHorizontalBox();
        hBox3.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox3);
        genderLabel = new JLabel("Gender: ");
        hBox3.add(genderLabel);
        genderCombo = new JComboBox(genderList);
        hBox3.add(genderCombo);

        Box hBox4 = Box.createHorizontalBox();
        hBox4.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox4);
        ageLabel = new JLabel("Age: ");
        hBox4.add(ageLabel);
        ageField = new JTextField(12);
        hBox4.add(ageField);

        //adding a button to the parent vBox at the end
        editButton = new JButton("Edit Record");
        editButton.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(editButton);

        //checking if the student exist in the record only then showing the frame
       if(FileHandle.searchRecord(editID) == null){
            JOptionPane.showMessageDialog(null,"Student not found!");
            new Menu();

       }else{
           setVisible(true);
       }

        //adding an action listener to the edit button using anonymous class
        editButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        /*getting the text from the fields and storing it in variables to pass to the
                         * new Student object */
                        String name = nameField.getText();
                        int index = genderCombo.getSelectedIndex();
                        String gender = genderList[index];
                        int age = Integer.parseInt(ageField.getText());

                        //using a method in FileHandle class to edit the record of the student
                        FileHandle.editStudent(editID,name,gender,age);

                        //operations to be performed after adding the record
                        JOptionPane.showMessageDialog(null,"Record Edited!");
                        dispose();
                        new Menu();

                    }
                }
        );



    }


}
