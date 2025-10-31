package Hotel;

/**
 * Clase que representa a un huésped (cliente) del hotel.
 * Hereda de la clase abstracta Persona.
 */
public class Huesped extends Persona {
    private String correo; // correo electrónico del huésped

    /**
     * Constructor que inicializa los datos del huésped.
     */
    public Huesped(String id, String nombre, String telefono, String correo) {
        // Llama al constructor de la clase padre (Persona)
        super(id, nombre, telefono);
        this.correo = correo;
    }

    // Métodos de acceso (get y set)
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    /**
     * Devuelve una descripción en texto del huésped.
     */
    @Override
    public String toString() {
        return super.toString() + " - Correo: " + correo;
    }
}
