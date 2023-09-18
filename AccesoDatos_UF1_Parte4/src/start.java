import java.io.*;
import java.util.*;

public class start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione una opción.");
			System.out.println("1.- Escribir. ");
			System.out.println("2.- Leer. ");
			System.out.println("3.- Escribir en un archivo binario. ");
			System.out.println("4.- Salir. ");
			System.out.println("Opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce la ruta del archivo para escribir: ");
				scanner.nextLine(); // Consumir la línea en blanco después del número
				String filePath = scanner.nextLine();
				try {
					escritura.escribirDatos(filePath);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				leerDatos();
				break;
			case 3:
				binario.escribirBinario();
				break;
			case 4:
				System.out.println("Hasta luego");
				return;
			default:
				System.out.println("Opción incorrecta, pulse de nuevo.");
			}
		}
	}

	private static void leerDatos() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la ruta del archivo:");
		String filePath = scanner.nextLine();
		try {
			File file = new File(filePath);
			if (!file.exists()) {
				System.out.println("La ruta no es correcta.");
				return;
			}
			System.out.println("Elige una opción: ");
			System.out.println("1.- Leer el archivo. ");
			System.out.println("2.- Leer una persona.");
			//System.out.println("3.- Escribir datos en archivo binario.");
			System.out.println("Opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				leerArchivo(filePath);
				break;
			case 2:
				System.out.println("Dime el nombre a buscar: ");
				String nombreBuscado = scanner.nextLine();
				leerPersona(filePath, nombreBuscado);
				break;
			}
		} catch (IOException e) {
			System.out.println("Error de lectura.");
		}
	}
	//Método para leer el archivo.
	private static void leerArchivo(String filePath) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader(filePath));
		String linea;
		while ((linea = reader.readLine())!=null){
			System.out.println(linea);
		}
		reader.close();
	}
	//Método para leer el nombre buscado.
	private static void leerPersona(String filePath, String nombreBuscado) throws IOException{
		BufferedReader reader = new BufferedReader (new FileReader(filePath));
		String linea;
		boolean encontrado=false;
		while ((linea=reader.readLine())!=null) {
			String [] datos=linea.split(",");
			if (datos.length>=1&&datos[0].equalsIgnoreCase(nombreBuscado)) {
				System.out.println("La persona es: ");
				System.out.println("Nombre " + datos[0]);
				System.out.println("Apellido " + datos[1]);
				System.out.println("Ciudad " + datos[2]);
				System.out.println("Nacionalidad " + datos[3]);
				System.out.println("Edad " + datos[4]);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nombre no encontrado.");
		}
		reader.close();
	}
}