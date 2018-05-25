package controlador;

import java.io.File;
import java.util.*;

public class Control {

	public ArrayList<String> Control(String ubicacion) {
		File carpeta = new File(ubicacion);
		ArrayList<String> canciones = new ArrayList<>();
		if (carpeta.exists()) {
			listar(carpeta, canciones);
		}
		// Collections.sort(canciones);
		return canciones;
	}

	private static void listar(File file, ArrayList<String> canciones) {
		File[] listFiles = file.listFiles();
		try {
			if (file.isDirectory()) {
				for (File fileR : file.listFiles()) {
					if (fileR.getAbsolutePath().toLowerCase().endsWith(".mp3")
							|| fileR.getAbsolutePath().toLowerCase().endsWith(".m4a")
							|| fileR.getAbsolutePath().toLowerCase().endsWith(".mp4")
							|| fileR.getAbsolutePath().toLowerCase().endsWith(".ogg")
							|| fileR.getAbsolutePath().toLowerCase().endsWith(".flac")
							|| fileR.getAbsolutePath().toLowerCase().endsWith(".wav")) {
						canciones.add(fileR.toString() + "\n");
						// System.out.println(fileR);
					}
					listar(fileR, canciones);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
