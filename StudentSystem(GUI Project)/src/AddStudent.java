import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddStudent extends JFrame {

    //declaring variables that will be used in this frame
    private final JLabel addStudent;
    private final JLabel idLabel;
    private final JLabel nameLabel;
    private final JLabel genderLabel;
    private final JLabel ageLabel;

    private final JTextField idField;
    private final JTextField nameField;
    private final JComboBox genderCombo;
    private final JTextField ageField;

    private final JButton addButton;

    private final Box vBoxParent;

    //creating a list to pass to the gender combo box
    String[] genderList = new String[]{"Male","Female","Prefer not say"};

    public AddStudent() {
        super("Add Student");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,1000);

        // adding a parent vBox to the frame
        vBoxParent = Box.createVerticalBox();
        add(vBoxParent);

        //adding the title to vBox
        addStudent = new JLabel("Add New Record");
        addStudent.setFont(new Font("Verdana", Font.BOLD, 20));
        vBoxParent.add(addStudent);

        /*Creating multiple horizontal boxes in the parent vertical box to place the label and field
        * in a single horizontal line and setBorder method is used here to give padding between the
        * horizontal boxes containing the fields**/

        Box hBox1 = Box.createHorizontalBox();
        hBox1.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox1);
        idLabel = new JLabel("ID: ");
        hBox1.add(idLabel);
        idField = new JTextField(12);
        hBox1.add(idField);

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
        genderCombo.addItem(genderList);
        hBox3.add(genderCombo);

        Box hBox4 = Box.createHorizontalBox();
        hBox4.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox4);
        ageLabel = new JLabel("Age: ");
        hBox4.add(ageLabel);
        ageField = new JTextField(12);
        hBox4.add(ageField);

        //adding a button to the parent vBox at the end
        addButton = new JButton("Add Record");
        addButton.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(addButton);

        //setting visible true
        setVisible(true);

        addButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        /*getting the text from the fields and storing it in variables to pass to the
                        * new Student object */

                        int id = Integer.parseInt(idField.getText());
                        String name = nameField.getText();
                        int index = genderCombo.getSelectedIndex();
                        String gender = genderList[index];
                        int age = Integer.parseInt(ageField.getText());

                        Student temp = new Student(id,name,gender,age);

                        //getting the returned value of method in a boolean
                        boolean isAdded = FileHandle.addRecord(temp);

                        //checking if the student is added and performing actions according to needs
                        if(isAdded){
                            JOptionPane.showMessageDialog(null, "Record Added!");
                            dispose();
                            new Menu();
                        }else {
                            JOptionPane.showMessageDialog(null,"Student with this ID already exist try again!");
                            idField.setText("");
                            nameField.setText("");
                            genderCombo.setSelectedIndex(0);
                            ageField.setText("");
                        }

                    }
                }
        );



    }


}
