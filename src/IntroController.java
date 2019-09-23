import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;


public class IntroController
{
    boolean r = false;
    boolean x = false;
    static String longemail;
    static String longname;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private Label nameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Button nxtBtn;


    private void emailVal()
    {
        if(!email.getText().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\" +
                ".[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")){
            emailLabel.setText("Please Enter appropriate email format");
        }
        else {
            emailLabel.setText(null);
            r = true;
        }
    }


    private void nameVal()
    {
        if(!name.getText().matches("^\\pL+[\\pL\\pZ\\pP]*")) {
           nameLabel.setText("Please Enter a Name");
        }
        else{
            nameLabel.setText(null);
            x=true;
        }
    }



    @FXML
    public void handelNextScene(ActionEvent event) throws IOException
    {
        nameVal();
        emailVal();
        if(r==false || x==false)
        return;
        store();
        Parent configLoader = FXMLLoader.load(getClass().getResource("Config.fxml"));
        Scene configScene = new Scene(configLoader);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(configScene);
        window.show();
    }

    private void store() {
        longemail = String.valueOf(email.getText());
        longname = String.valueOf(name.getText());
    }

    public String getLongname() {
        return longname;
    }

    public String getLongemail() {
        return longemail;
    }
}
