import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;


public class FinalController {

    int finalprice;
    double taxAmt;


    @FXML
    private Label NameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label bodyLabel;

    @FXML
    private Label bodyPrice;

    @FXML
    private Label engineLabel;

    @FXML
    private Label enginePrice;

    @FXML
    private Label extColorLabel;

    @FXML
    private Label extColorPrice;

    @FXML
    private Label intColorLabel;

    @FXML
    private Label intColorPrice;

    @FXML
    private Label wheelLabel;

    @FXML
    private Label wheelPrice;

    @FXML
    private Label trimLabel;

    @FXML
    private Label trimPrice;

    @FXML
    private Label laneLabel;

    @FXML
    private Label lanePrice;

    @FXML
    private Label parkLabel;

    @FXML
    private Label parkPrice;

    @FXML
    private Label subTotal;

    @FXML
    private Label tax;

    @FXML
    private Label total;

    IntroController intro = new IntroController();
    ConfigController config = new ConfigController();
    getPrice price = new getPrice();

    @FXML
    public void initialize() {
        NameLabel.setText(intro.getLongname());
        emailLabel.setText(intro.getLongemail());
        bodyLabel.setText(config.type);
        bodyPrice.setText(price.run(config.type));
        engineLabel.setText(config.engine);
        enginePrice.setText(price.run(config.engine));
        extColorLabel.setText(config.extColor);
        extColorPrice.setText(price.run(config.extColor));
        intColorLabel.setText(config.intColor);
        intColorPrice.setText(price.run(config.intColor));
        wheelLabel.setText(config.wheel);
        wheelPrice.setText(price.run(config.wheel));
        trimLabel.setText(config.trim);
        trimPrice.setText(price.run(config.trim));

        finalprice = price.getFinalPrice();


            if (config.lane == "true") {
                laneLabel.setText("Yes");
                lanePrice.setText("$1700.00");
                finalprice = finalprice + 1700;
            }
            else {
                laneLabel.setText("No");
                lanePrice.setText("$0.00");
            }
            if (config.park == "true") {
                parkLabel.setText("Yes");
                parkPrice.setText("$2900.00");
                finalprice = finalprice + 2900;
            }
            else {
                parkLabel.setText("No");
                parkPrice.setText("$0.00");
            }

            String temp = "$" +finalprice+".00";
            subTotal.setText(temp);
            taxAmt = finalprice *.069;
            temp = "$" + String.format("%.2f", taxAmt);
            tax.setText(temp);
            double money = taxAmt+finalprice;
            temp = "$" + String.format("%.2f", money);
            total.setText(temp);





    }
}
