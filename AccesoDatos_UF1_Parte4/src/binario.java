import java.io.*;
import java.util.*;

// Clase Persona que implementa la interfaz Serializable
class Persona implements Serializable {
    // Campos de la clase Persona
    private String nombre;
    private String apellido;
    private String ciudad;
    private String nacionalidad;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido, String ciudad, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    // Getters y setters para acceder a los campos de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class binario {

    public static void escribirBinario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo binario: ");
        String filePath = scanner.nextLine();
        System.out.println("Cuántas personas quieres introducir (máximo 3)?");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();
        if (numPersonas > 3) {
            System.out.println("Introduce 1, 2 o 3.");
            return;
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Vamos a guardar los datos en una lista.
            List<Persona> personas = new ArrayList<>();
            for (int i = 0; i < numPersonas; i++) {
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
                int edad = scanner.nextInt();
                scanner.nextLine();
                Persona nuevaPersona = new Persona(nombre, apellido, ciudad, nacionalidad, edad);
                personas.add(nuevaPersona);
                scanner.nextLine();
            }
            // Escribir la lista de personas en el archivo binario
            oos.writeObject(personas);
            oos.flush(); // Asegura que los datos se escriban completamente en el archivo
            System.out.println("Datos de " + numPersonas + " personas guardadas en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }
}
