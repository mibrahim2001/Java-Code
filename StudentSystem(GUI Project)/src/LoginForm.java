import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    //declaring variables that will be used in this frame
    private final JLabel loginLabel,userNameLabel,passwordLabel;
    private final JTextField userNameField;
    private final JPasswordField passwordField;
    private final JButton loginButton;

    //creating a login username and password to match when logging in
    private String originalUserName = "ibrahim";
    private String originalPassword = "12345";

    //constructor
    public LoginForm(){
        super("Login");
        setLayout(null);

        //adding the labels and fields to the vBox
        loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        loginLabel.setBounds(300,50,100,50);
        add(loginLabel);

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(170,150,100,30);
        add(userNameLabel);

        userNameField = new JTextField(12);
        userNameField.setBounds(270,150,150,30);
        add(userNameField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(170,220,100,30);
        add(passwordLabel);

        passwordField = new JPasswordField(12);
        passwordField.setBounds(270,220,150,30);
        add(passwordField);

        //adding a login button to the frame
        loginButton = new JButton("Login");
        loginButton.setBounds(270,270,150,30);
        add(loginButton);

        //adding an action listener to the login button using anonymous class
        loginButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        //getting username and password from the respective fields
                        String userName = userNameField.getText();
                        String password = String.valueOf(passwordField.getPassword());

                        /*checking if the username and password are correct and then  opening
                        the menu frame if true else showing a message dialog box */

                        if(userName.equals(originalUserName) && password.equals(originalPassword)){
                            setVisible(false);
                            Menu mainMenu = new Menu();
                        }else
                            JOptionPane.showMessageDialog(null,"Invalid username or password!");
                    }
                }
        );

    }
}
