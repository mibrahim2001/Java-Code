import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{

    //declaring variables
    private final JLabel menuLabel;
    private final JButton addRecordButton;
    private final JButton searchRecordButton;
    private final JButton deleteRecordButton;
    private final JButton editRecordButton;

    //constructor
    public Menu(){
        super("Student Record System");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,1000);


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(20, 0, 20, 0);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        add(panel);

        //adding menuLabel as the main title
        menuLabel = new JLabel("Main Menu");
        menuLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        panel.add(menuLabel,c);

        //creating option buttons
        addRecordButton = new JButton("Add Record");
        addRecordButton.setMargin(new Insets(30,30,30,30));

        searchRecordButton = new JButton("Search Record");
        searchRecordButton.setMargin(new Insets(30,30,30,30));

        deleteRecordButton = new JButton("Delete Record");
        deleteRecordButton.setMargin(new Insets(30,30,30,30));

        editRecordButton = new JButton("Edit Record");
        editRecordButton.setMargin(new Insets(30,30,30,30));


        //adding these buttons to the panel
        panel.add(addRecordButton,c);
        panel.add(searchRecordButton,c);
        panel.add(deleteRecordButton,c);
        panel.add(editRecordButton,c);

        //making a handler object
        myActionHandler handler = new myActionHandler();

        //adding event to the button
        addRecordButton.addActionListener(handler);
        searchRecordButton.addActionListener(handler);
        deleteRecordButton.addActionListener(handler);
        editRecordButton.addActionListener(handler);

        //setting the visibility of the menu to true
        setVisible(true);



    }
    private class myActionHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            //checking which button is clicked and creating and opening its frame
            if(e.getSource() == addRecordButton){
                dispose();
                AddStudent addStudent = new AddStudent();

            }else if(e.getSource() == searchRecordButton){
                //getting the search term by the user
                int inputID = Integer.parseInt(JOptionPane.showInputDialog("Please enter ID to search"));

                //searching the student by a method in fileHandle class and storing in Student type variable
                Student searchedStudent = FileHandle.searchRecord(inputID);

                //showing a message dialog box containing information of searched student
                if(searchedStudent != null) {
                    JOptionPane.showMessageDialog(null, "\tSearched User: \n" +
                            "ID: " + searchedStudent.getId() + "\n" +
                            "Name: " + searchedStudent.getName() + "\n" +
                            "Gender: " + searchedStudent.getGender() + "\n" +
                            "Age: " + searchedStudent.getAge());

                }else{
                    JOptionPane.showMessageDialog(null,"Student cannot be searched!");
                }

            }else if(e.getSource() == deleteRecordButton){
                //getting delete term by the user
                int deleteID = Integer.parseInt(JOptionPane.showInputDialog("Please enter ID to delete record"));
                boolean deleted = FileHandle.deleteStudent(deleteID);
                if(deleted){
                    JOptionPane.showMessageDialog(null,"Student deleted successfully");

                }else JOptionPane.showMessageDialog(null,"Student not found!");


            }else if(e.getSource() == editRecordButton){
                dispose();
                EditStudent editStudent = new EditStudent();
            }
        }
    }


}
