package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    public TextArea textArea;

    public void clickButton(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
        textField.clear();
    }

    public void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
        textField.clear();
    }
}
