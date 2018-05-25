package pruebas;

import java.io.File;

public class Control {

	public static void main(String[] args) {
		File carpeta = new File("c:/users/dguer/Music");
		if (carpeta.exists()) {
			listar(carpeta);
		}
	}

	private static void listar(File file) {
		try {
			File[] listFiles = file.listFiles();

			if (file.isDirectory()) {
				for (File fileR : file.listFiles()) {
					if (fileR.getAbsolutePath().toLowerCase().endsWith(".m4a")) {
						System.out.println(fileR);
					}
					listar(fileR);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
