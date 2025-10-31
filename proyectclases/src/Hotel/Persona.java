package Hotel;

/**
 * Clase abstracta base que representa a cualquier persona relacionada con el hotel.
 * Se usa como clase padre para "Huesped" y "Empleado".
 */
public abstract class Persona {
    // Atributos comunes a todas las personas
    private String id;
    private String nombre;
    private String telefono;

    /**
     * Constructor que inicializa los datos básicos de la persona.
     */
    public Persona(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Métodos "get" para acceder a los atributos (encapsulación)
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    // Métodos "set" para modificar algunos atributos
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    /**
     * Método que devuelve una representación en texto del objeto.
     */
    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}

