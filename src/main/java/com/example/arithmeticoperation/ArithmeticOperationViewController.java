package com.example.arithmeticoperation;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ArithmeticOperationViewController
{
    @javafx.fxml.FXML
    private TextField xTextField;
    @javafx.fxml.FXML
    private TextField yTextField;
    @javafx.fxml.FXML
    private Label resultLabel;
    @javafx.fxml.FXML
    private Button addButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnMouseClicked(Event event) {
        String xStr = xTextField.getText();
        String yStr = yTextField.getText();

        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);

        int sum = xVal + yVal;
        String sumStr = Integer.toString(sum);
//        resultLabel.setText("X(" + xStr + ") + Y (" +xStr+ ") = " + sumStr);
        resultLabel.setText("X + Y = "+sumStr);
    }

    @javafx.fxml.FXML
    public void addButtonOnMouseExited(Event event) {
        addButton.setText("ADD");
    }

    @javafx.fxml.FXML
    public void addButtonOnMouseEntered(Event event) {
        addButton.setText("Wait");
    }

    @javafx.fxml.FXML
    public void subtractBtnOnAction(ActionEvent actionEvent) {
        resultLabel.setText("X - Y = "+
                Integer.toString(
                        Integer.parseInt(xTextField.getText())
                                -
                           Integer.parseInt(yTextField.getText())));
    }
}