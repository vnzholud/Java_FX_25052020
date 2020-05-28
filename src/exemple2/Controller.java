package exemple2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    public Button btnadd;
    @FXML
    public VBox vbox;

    public void btnaddClick() {
        int x = (int) (Math.random() * 100);
        Button button = new Button("btn" +""+x);
        vbox.getChildren().add(button);
        button.setOnAction(event -> {
            System.out.println(x);
        });
    }
}
