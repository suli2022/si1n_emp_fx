import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.MainView;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        Scene scene = new Scene(mainController.getMainView(), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Táblázat");
        stage.show();
        
    }
}
