package jv2_assignment5;

import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import jv2_session7.UserDAO;

import java.net.URL;
import java.util.ResourceBundle;

public class Edit implements Initializable {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public static User userEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        txtUsername.setText(userEdit.getUsername());
        txtEmail.setText(userEdit.getEmail());
        txtPassword.setText(userEdit.getPassword());
    }
    public void update(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        try {
            userEdit.setUsername(username);
            userEdit.setEmail(email);
            userEdit.setPassword(pass);
            UserDAO ud = UserDAO.getInstance();
            ud.update(userEdit);
//            User u = new User(null,username,email,pass);
//            userDAO userDAO = userDAO.getInstance();
//            userDAO.update(useredit);
        } catch (Exception e){}


    }
}
