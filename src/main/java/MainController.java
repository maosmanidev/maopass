import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private Button CheckButton;

    @FXML
    private Text Common;

    @FXML
    private Label CommonResults;

    @FXML
    private PasswordField Password;

    @FXML
    private Text Score;

    @FXML
    private Label ScoreResults;

    @FXML
    void CheckPassword(MouseEvent event) {
        String password = "";
        password = Password.getText().strip();
        String Strength = PasswordMeter.PasswordMeterString(password);
        ScoreResults.setText("Your password is  "+Strength );
        // This is for checking if the password is common password or not...
          
        String Result = PasswordsComparing.Resutls(password);
        CommonResults.setText(Result);

    }

}
