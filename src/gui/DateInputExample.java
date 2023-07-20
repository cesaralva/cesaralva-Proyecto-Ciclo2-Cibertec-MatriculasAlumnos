package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateInputExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        // Crear un JFormattedTextField para ingresar la fecha
        JFormattedTextField dateField = new JFormattedTextField(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dateField.setColumns(10);
        frame.getContentPane().add(new JLabel("Fecha: "));
        frame.getContentPane().add(dateField);

        JButton button = new JButton("Obtener Fecha");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el valor ingresado y convertirlo a LocalDate
                String fechaString = dateField.getText();
                LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                // Realizar alguna operación con la fecha, por ejemplo, mostrarla en un diálogo
                JOptionPane.showMessageDialog(frame, "Fecha ingresada: " + fecha);
            }
        });

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}

