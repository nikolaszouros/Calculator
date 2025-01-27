package Calculator.Views;

import Calculator.Controllers.ConvController;
import Calculator.Controllers.SciController;
import Calculator.Controllers.SimpleController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OptionScreen {

    public OptionScreen(ImageView imageView, String optionName) {

    }

    // returns a box with the image and the description of the option
    @SuppressWarnings("unused")
    public static HBox getOption(String index, ImageView imageView, String optionName, Stage stage) {
        HBox box = new HBox();
        box.setStyle("-fx-background-color : #003459");
        box.setSpacing(5);
        box.setAlignment(Pos.CENTER);

        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);
        HBox.setHgrow(imageView, Priority.ALWAYS);
        Label i = new Label(index);
        i.setStyle("-fx-text-fill: black;");
        i.setFont(new Font("Arial Rounded MT Bold", 0));
        box.getChildren().add(i);
        box.getChildren().add(imageView);

        Label label = new Label(optionName);
        label.setStyle("-fx-text-fill: black;");
        label.setFont(new Font("Arial Rounded MT Bold", 15));
        box.getChildren().add(label);
        
        //setting the size of each box based on the calc option
        switch(index){
            case "1":
            box.setMaxWidth(190);
            break;

            case "2":
            box.setMaxWidth(230);
            break;

            case "3":
            box.setMaxWidth(190);
            break;
        }
        //box.setStyle("-fx-border-color: blue; -fx-border-width: 2; -fx-border-radius: 5;");

        // deciding the option
        box.setOnMouseClicked(event ->{
            switch(index){
                case "1":
                new SimpleController(stage);
                break;

                case "2":
                System.out.println("New Sci");
                //new SciController(stage);
                break;

                case "3":
                System.out.println("New Conv");
                //new ConvController(stage);
                break;
            }
        });

        return box;
    }

}
