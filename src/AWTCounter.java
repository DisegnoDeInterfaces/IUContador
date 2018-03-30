import java.awt.*;         // Utilizando contenedores y componentes AWT
import java.awt.event.*;   // Utilizando clases e interfaces de escuchadores AWT'

// Una Interfaz gráfica AWT que hereda el contenedor de nivel superior java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
    private Label etiquetaContar;     // Declaramos componente Label
    private TextField cajaTextoContar;  // Declaramos componente TextField
    private Button botonContar;    // Declaramos componente Button
    private int contador = 0;      // contador inicializado a cero

    // Constructor para configurar los componentes de la IU y los manejadores de eventos
    AWTCounter () {
        setLayout(new FlowLayout());
        // Frame "superior" que configura el layout a FlowLayout, el cual ordena
        // los componentes de izquierda a derecha y después de arriba a abajo.

        etiquetaContar = new Label("Contador"); // Constructor del componente  Label
        add(etiquetaContar);                   // El Frame "superior" añade la etiqueta

        cajaTextoContar = new TextField(contador + "", 10); // Constructor del componenteTextField
        cajaTextoContar.setEditable(false);       // solo lectura
        add(cajaTextoContar);                     // El Frame "superior" añade el TextField

        botonContar = new Button("Contar");   // Constructor del componente Button
        add(botonContar);                    // El Frame "superior" añade el Button
        botonContar.addActionListener(this);
        // botonContar es el objeto fuente que dispara el  ActionEvent cuando es pulsado.
        // La fuente añade la instancia "this" como escuchador ActionEvent , el cual provee
        // un manejador ActionEvent llamado actionPerformed().
        // Al hacer clic en botonContar invokes actionPerformed().

        setSize(300, 100);       // Frame "superior" fija el tamaño inicial
        setTitle("Contador AWT"); // Frame "superior" fija el título de la ventana
        setVisible(true);        // mostramos el Frame
    }

    // ActionEvent handler - Called back when the button is clicked.
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++contador;                     // Aumenta el valor del contador
        cajaTextoContar.setText(contador + ""); // Lo mostramos en el TextField
        // setText() coge un String
    }


}