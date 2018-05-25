package controlador;

import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

import vista.UI;

public class ParaUI extends UI {

	public ParaUI() {
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int seleccion = fc.showOpenDialog(contentPane);
				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File fichero = fc.getSelectedFile();
					txtUbicacion.setText(fichero.getAbsolutePath());
				}
			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtUbicacion.getText().isEmpty()) {
					textArea.setText(null);
					Control control = new Control();
					ArrayList<String> canciones = control.Control(txtUbicacion.getText());
					if (!canciones.isEmpty()) {
						for (String string : canciones) {
							textArea.setText(textArea.getText() + string);
						}
					} else {
						// Mostrar dialogo de aviso
						JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
					}

				} else {
					// Mostrar dialogo de aviso
					JOptionPane.showMessageDialog(null, "Introduzca la ubicacion a escanear");
				}
			}
		});
	}
}
