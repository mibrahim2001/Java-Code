import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddAccount extends JFrame {

    //declaring variables that will be used in this frame
    private final JLabel addAccount;
    private final JLabel openingBalanceLabel;
    private final JLabel nameLabel;
    private final JLabel ageLabel;

    private final JTextField openingBalanceField;
    private final JTextField nameField;
    private final JTextField ageField;

    private final JRadioButton currentAccountRadio;
    private final JRadioButton savingAccountRadio;
    private final JRadioButton investmentAccountRadio;

    private final JCheckBox zakatCheckBox;


    private final ButtonGroup radioButtonGroup;

    private final JButton addButton;

    private final Box vBoxParent;

    private final Box hBox5;

    public AddAccount() {
        super("Add Student");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700,1000);

        // adding a parent vBox to the frame
        vBoxParent = Box.createVerticalBox();
        add(vBoxParent);

        //adding the title to vBox
        Box titleHBox = Box.createHorizontalBox();
        titleHBox.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(titleHBox);
        addAccount = new JLabel("Add New Record");
        addAccount.setFont(new Font("Verdana", Font.BOLD, 20));
        titleHBox.add(addAccount);

        /* Creating multiple horizontal boxes in the parent vertical box to place the label and field
         * in a single horizontal line and setBorder method is used here to give padding between the
         * horizontal boxes containing the fields */

        Box hBox1 = Box.createHorizontalBox();
        hBox1.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox1);
        nameLabel = new JLabel("Name:");
        nameLabel.setBorder(new EmptyBorder(0,0,0,25));
        hBox1.add(nameLabel);
        nameField = new JTextField(5);
        hBox1.add(nameField);

        Box hBox2 = Box.createHorizontalBox();
        hBox2.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox2);
        ageLabel = new JLabel("Age:");
        ageLabel.setBorder(new EmptyBorder(0,0,0,35));
        hBox2.add(ageLabel);
        ageField = new JTextField(5);
        hBox2.add(ageField);

        Box hBox3 = Box.createHorizontalBox();
        hBox3.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox3);
        openingBalanceLabel = new JLabel("Opening\nBalance: ");
        openingBalanceLabel.setBorder(new EmptyBorder(0,0,0,5));
        hBox3.add(openingBalanceLabel);
        openingBalanceField = new JTextField(5);
        hBox3.add(openingBalanceField);

        Box hBox4 = Box.createHorizontalBox();
        hBox4.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox4);

        //declaring radio buttons
        currentAccountRadio = new JRadioButton("Current Account",true);
        savingAccountRadio = new JRadioButton("Savings Account",false);
        investmentAccountRadio = new JRadioButton("Investment Account",false);

        //adding radio buttons in hBox4
        hBox4.add(currentAccountRadio);
        hBox4.add(savingAccountRadio);
        hBox4.add(investmentAccountRadio);

        //adding radio buttons to a button group
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(currentAccountRadio);
        radioButtonGroup.add(savingAccountRadio);
        radioButtonGroup.add(investmentAccountRadio);

        hBox5 = Box.createHorizontalBox();
        hBox5.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox5);
        zakatCheckBox = new JCheckBox("Zakat Applied");
        hBox5.add(zakatCheckBox);
        JCheckBox filerCheckBox = new JCheckBox("Filer");
        hBox5.add(filerCheckBox);
        filerCheckBox.setVisible(false);

        Box hBox6 = Box.createHorizontalBox();
        hBox6.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(hBox6);
        JLabel typeLabel = new JLabel("Account Type: ");
        typeLabel.setBorder(new EmptyBorder(0,0,0,25));
        hBox6.add(typeLabel);
        JRadioButton oneYearType = new JRadioButton("1 Year",true);
        JRadioButton threeYearType = new JRadioButton("3 Year",false);
        JRadioButton fiveYearType = new JRadioButton("5 Year",false);
        hBox6.add(oneYearType);
        hBox6.add(threeYearType);
        hBox6.add(fiveYearType);
        ButtonGroup typeButtonGroup = new ButtonGroup();
        typeButtonGroup.add(oneYearType);
        typeButtonGroup.add(threeYearType);
        typeButtonGroup.add(fiveYearType);
        hBox6.setVisible(false);






        //if saving account radio button is selected show this
        savingAccountRadio.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        filerCheckBox.setVisible(true);
                        hBox6.setVisible(false);

                    }
                }
        );

        //if current account radio button is selected show this
        currentAccountRadio.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        filerCheckBox.setVisible(false);
                        hBox6.setVisible(false);
                    }
                }
        );

        //if investment account radio button is selected show this
        investmentAccountRadio.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        filerCheckBox.setVisible(true);
                        hBox6.setVisible(true);
                    }
                }
        );


        //adding a button to the parent vBox at the end
        Box buttonHBox = Box.createHorizontalBox();
        buttonHBox.setBorder(new EmptyBorder(10,10,10,10));
        vBoxParent.add(buttonHBox);
        addButton = new JButton("Add Record");
        addButton.setBorder(new EmptyBorder(10,10,10,10));
        buttonHBox.add(addButton);


        //setting visible true
        setVisible(true);

       /* addButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        *//*getting the text from the fields and storing it in variables to pass to the
                         * new Student object *//*

                        int id = Integer.parseInt(openingBalanceField.getText());
                        String name = nameField.getText();
                        int age = Integer.parseInt(ageField.getText());
                        double openingBalance = Double.parseDouble(openingBalanceField.getText());

                        if(currentAccountRadio.isSelected()){

                        }

                        Account temp = null;

                        //getting the returned value of method in a boolean
//                        boolean isAdded = FileHandle.addRecord(temp);

                        //checking if the student is added and performing actions according to needs
                        if(isAdded){
                            JOptionPane.showMessageDialog(null, "Record Added!");
                            dispose();
                            new Menu();
                        }else {
                            JOptionPane.showMessageDialog(null,"Student with this ID already exist try again!");
                            openingBalanceField.setText("");
                            nameField.setText("");
                            ageField.setText("");
                        }

                    }
                }
        );*/



    }


}
