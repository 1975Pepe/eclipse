import java.io.*;
import java.util.*;

public class escritura {
    public static void escribirDatos(String filePath)throws IOException {
        File file = new File(filePath);
        boolean fileExists = file.exists();
        BufferedWriter writer;
        Scanner scanner = new Scanner(System.in);

        if (fileExists) {
            System.out.println("El archivo existe, quieres sobreescribirlo (S) o añadir (A)? ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("S")) {
                writer = new BufferedWriter(new FileWriter(filePath, false)); // Sobrescribe el archivo
            } else if (opcion.equalsIgnoreCase("A")) {
                writer = new BufferedWriter(new FileWriter(filePath, true)); // Añade al archivo
            } else {
                System.out.println("Opción no válida");
                return;
            }
        } else {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // Si el archivo no existe, añade al archivo
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nIntroduce los siguientes datos: " + (i + 1) + ": ");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.println("Nacionalidad: ");
            String nacionalidad = scanner.nextLine();
            System.out.println("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            writer.write(nombre + ", " + apellido + ", " + ciudad + ", " + nacionalidad + ", " + edad + " años.");
            writer.newLine();
        }

        writer.close();

        if (file.exists()) {
            System.out.println("Los datos se han añadido correctamente.");
        } else {
            System.out.println("El archivo se ha creado con los datos de las personas.");
        }
    }
}
