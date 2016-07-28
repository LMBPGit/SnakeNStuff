import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        SnakeWindow snakeWindow = new SnakeWindow();
        snakeWindow.start(primaryStage);
    }

}
