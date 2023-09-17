public class start {
    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Juan", "Pérez", "Madrid", "Española", 35);
        Persona persona2 = new Persona("Jose");
        Persona persona3 = new Persona();

        // Mostrar información de las personas
        System.out.println("Persona 1: ");
        persona1.mostrarInformacion();
        System.out.println("Persona 2: ");
        persona2.mostrarInformacion();
        System.out.println("Persona 3: (vacía)");
        persona3.mostrarInformacion();
    }
}