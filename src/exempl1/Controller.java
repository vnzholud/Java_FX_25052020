package exempl1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    public Slider slider;
    @FXML
    public Label label;

    public void menuExitClick() {
        System.exit(0);
    }

    public void onMouseReleasedClick(MouseEvent mouseEvent) {

        label.setText("Value :"+(int)slider.getValue());
    }
}
