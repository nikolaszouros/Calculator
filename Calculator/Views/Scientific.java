package Calculator.Views;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Scientific {

    private Circle circle;
    private HBox output;
    private GridPane buttonContainer;
    private Label label;
    private Stage sciStage;
    private Scene sciScene;

    public Scientific(Stage stage){
        stage.close();
        sciStage = new Stage();
        startScene();
    }

    public void startScene(){

        sciScene = new Scene(getNumberButtons(),350,450);
        sciStage.setScene(sciScene);
        sciStage.setTitle("Calculator");


        sciStage.show();
    }

    public GridPane getNumberButtons() {
        buttonContainer = new GridPane();
        return buttonContainer;
    }
}
