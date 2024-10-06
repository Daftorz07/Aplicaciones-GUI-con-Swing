package org.replicadorTexto;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame{

    private JPanel ventanaPrincipal;
    private JTextField cajaTexto;
    private JLabel replicadorLabel;

    public VentanaPrincipal(){
        inicializarVentana();
        cajaTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replicarTexto();
            }
        });

        cajaTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                replicarTexto();
            }
        });
    }

    private void inicializarVentana() {
        //Configuración del panel
        setContentPane(ventanaPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void replicarTexto() {

        String textoDigitado = this.cajaTexto.getText();
        this.replicadorLabel.setText(textoDigitado);
    }

    public static void main(String[] args) {

        //Cambia el look and feel a modo dark
        FlatDarculaLaf.setup();

        VentanaPrincipal newVentana = new VentanaPrincipal();
        newVentana.setVisible(true);
    }
}
