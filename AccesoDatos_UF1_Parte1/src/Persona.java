public class Persona {
    // Propiedades de la clase persona.
    private String nombre;
    private String apellido;
    private String ciudad;
    private String nacionalidad;
    private int edad;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con todos los campos y generación de getters and setters
    public Persona(String nombre, String apellido, String ciudad, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    // Getters y setters
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

    // Método para mostrar todos los campos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Edad: " + edad);
    }
}