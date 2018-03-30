
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void awtCounter(){
        // Invocamos al contructor creando una instancia anónimca
        new AWTCounter();
    }

    public static void swingCounter(){
        // Let the constructor does the job
        javax.swing.SwingUtilities.invokeLater(SwingCounter::new);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/counter.fxml"));

        primaryStage.setTitle("Counter JavaFX");
        primaryStage.setScene(new Scene(root, 350, 100));
        primaryStage.show();
    }

    public static void main(String[] args)  {

        //awtCounter();
        //swingCounter();
        launch(args);
    }
}
