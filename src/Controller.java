
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private int contador = 0;

    @FXML
    private TextField cajaTextoContar;

    public void manejadorContar(ActionEvent actionEvent) {
        contador++;
        cajaTextoContar.setText(String.valueOf(contador));
    }
}