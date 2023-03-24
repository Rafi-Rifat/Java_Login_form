package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.sql.Connection;

public class Controller {

    @FXML
    private Button cancelButton;

    public void cancelButtonAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Label loginMessageLabel;

    public void loginButtonAction(ActionEvent e) {
        if (usernameField.getText().isBlank() == true && passwordField.getText().isBlank() == true) {
            loginMessageLabel.setText("Please enter username and password");
            // validateLogin();

        } else if (usernameField.getText().isBlank() == true) {
            loginMessageLabel.setText("Please enter username");
        } else if (passwordField.getText().isBlank() == true) {
            loginMessageLabel.setText("Please enter password");
        } else {
            loginMessageLabel.setText("Welcome");

        }

    }

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // public void validateLogin() {
    // DatabaseConnection connectNow = new DatabaseConnection();
    // Connection connectDB = connectNow.getConnection();
    // String verifyLogin = "";
    // }

}