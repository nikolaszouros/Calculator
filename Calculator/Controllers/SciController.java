package Calculator.Controllers;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SciController {

    private Stage sciStage;
    private Scene sciScene;
    private Parent vbox;

    public SciController(Stage stage) {
        stage.close();
        sciStage = new Stage();
        startScene();
    }

    public void startScene() {

        sciScene = new Scene(vbox, 350, 450);
        sciStage.setScene(sciScene);
        sciStage.setTitle("Calculator");

        sciStage.show();
    }

}
