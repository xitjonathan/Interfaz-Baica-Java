import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends JFrame {
    private JTextField campoTexto;
    private JButton botonSaludar;
    private JLabel etiquetaResultado;

    public button() {
        setTitle("Ejemplo con JButton");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel etiqueta = new JLabel("Ingresa tu nombre (>:D) : ");
        etiqueta.setBounds(20, 20, 150, 25);

        campoTexto = new JTextField();
        campoTexto.setBounds(20, 50, 150, 25);

        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(20, 80, 100, 25);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 120, 250, 25);

        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                if (!nombre.isEmpty()) {
                    etiquetaResultado.setText("¡Hola, " + nombre + "!");
                } else {
                    etiquetaResultado.setText("Por favor escribe un nombre");
                }
            }
        });

        add(etiqueta);
        add(campoTexto);
        add(botonSaludar);
        add(etiquetaResultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new button();
    }
}
