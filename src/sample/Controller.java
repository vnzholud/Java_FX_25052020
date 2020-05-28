package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button КНОПКА;
    @FXML
    private javafx.scene.control.TextArea TextArea;
    @FXML
    private javafx.scene.control.TextField TextField;

    public void button1Click() {

        TextArea.appendText(TextField.getText());
    }
}
