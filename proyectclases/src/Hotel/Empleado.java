package Hotel;

/**
 * Clase que representa a un empleado del hotel.
 * También hereda de la clase Persona.
 */
public class Empleado extends Persona {
    private String puesto; // cargo o función del empleado

    public Empleado(String id, String nombre, String telefono, String puesto) {
        // Constructor que llama al de la clase padre
        super(id, nombre, telefono);
        this.puesto = puesto;
    }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
}
