import java.awt.*;         // Utilizando contenedores y componentes AWT
import java.awt.event.*;   // Utilizando clases e interfaces de escuchadores AWT'
import javax.swing.*;      // Utilizando componentes y contenedores Swing


// Una Interfaz gráfica Swing que extiende javax.swing.JFrame  (en vez de java.awt.Frame)awt.Frame

class SwingCounter extends JFrame {
     private JTextField cajaTextoContar;
    // Usa  el JTextField  de Swing en vez del TextField AWT
    private JButton botonContar;
    // Usael JButton de Swing en vez del Button de AWT
    private int contador = 0;



    SwingCounter() {
        // Obtiene el panel de contenidos (contentPane) del contenedor de nivel superior Jframe
        // Los componentes son añadidos al panel de contenidos
        Container panelContenido = getContentPane();
        panelContenido.setLayout(new FlowLayout());

        panelContenido.add(new JLabel("Contador"));
        cajaTextoContar = new JTextField(contador + "", 10);
        cajaTextoContar.setEditable(false);
        cajaTextoContar.setHorizontalAlignment(JTextField.RIGHT);
        panelContenido.add(cajaTextoContar);

        botonContar = new JButton("Contar");
        panelContenido.add(botonContar);

        botonContar.addActionListener(evt -> {
            ++contador;
            cajaTextoContar.setText(contador + "");
        });



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Salir del programa si se pulsa en el botón de cerrar del Jframe
        setSize(300, 100);
        setTitle("Contador Swing");
        setVisible(true);    // show it
    }
}