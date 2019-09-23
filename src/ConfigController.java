import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;

public class ConfigController {
    ObservableList<String> typeList = FXCollections.observableArrayList("Hatchback", "Sedan", "SUV");
    ObservableList<String> engineList = FXCollections.observableArrayList("2L", "3L", "4L");
    ObservableList<String> extColorList = FXCollections.observableArrayList("Black", "Blue", "Green");
    ObservableList<String> intColorList = FXCollections.observableArrayList("Black", "Brown", "White");
    ObservableList<String> wheelList = FXCollections.observableArrayList("16 IN", "18 IN", "20 IN");

    static String type;
    static String engine;
    static String extColor;
    static String intColor;
    static String wheel;
    static String trim;
    static String lane;
    static String park;


    @FXML
    private ChoiceBox typeBox;
    @FXML
    private ChoiceBox engineBox;
    @FXML
    private ChoiceBox extColorBox;
    @FXML
    private ChoiceBox intColorBox;
    @FXML
    private ChoiceBox wheelBox;
    @FXML
    private ToggleGroup trimGroup;
    @FXML
    private CheckBox laneBox;
    @FXML
    private CheckBox parkBox;



    @FXML
    private void initialize() {
        typeBox.setValue("Hatchback");
        typeBox.setItems(typeList);
        engineBox.setValue("2L");
        engineBox.setItems(engineList);
        extColorBox.setValue("Black");
        extColorBox.setItems(extColorList);
        intColorBox.setValue("Black");
        intColorBox.setItems(intColorList);
        wheelBox.setValue("16 IN");
        wheelBox.setItems(wheelList);
    }

    private void save()
    {

        type = String.valueOf(typeBox.getValue());
        engine = String.valueOf(engineBox.getValue());
        extColor = String.valueOf(extColorBox.getValue());
        intColor = String.valueOf(intColorBox.getValue());
        wheel = String.valueOf(wheelBox.getValue());
        RadioButton rd = (RadioButton) trimGroup.getSelectedToggle();
        trim = rd.getText();
        lane = String.valueOf(laneBox.isSelected());
        park = String.valueOf(parkBox.isSelected());

    }

    @FXML
    public void handelFinalScene(ActionEvent event) throws IOException
    {

        save();
        Parent finalLoader = FXMLLoader.load(getClass().getResource("FinalScene.fxml"));
        Scene finalScene = new Scene(finalLoader);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(finalScene);
        window.show();


    }

}