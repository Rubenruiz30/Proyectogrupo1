package Hotel;

/**
 * Representa una habitación del hotel.
 * Cada habitación tiene un número, tipo, precio y estado (disponible/ocupada).
 */
public class Habitacion {
    private int numero;
    private String tipo;           // Ejemplo: "Individual", "Doble", "Suite"
    private double precioPorNoche; // Precio de la habitación por noche
    private boolean disponible;    // true si está libre, false si está ocupada

    /**
     * Constructor para crear una habitación nueva.
     */
    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true; // Por defecto la habitación está libre
    }

    // Métodos de acceso
    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPrecioPorNoche() { return precioPorNoche; }
    public boolean isDisponible() { return disponible; }

    /**
     * Marca la habitación como reservada.
     */
    public void reservar() { this.disponible = false; }

    /**
     * Libera la habitación (la hace disponible).
     */
    public void liberar() { this.disponible = true; }

    /**
     * Muestra la información completa de la habitación.
     */
    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") $" + precioPorNoche + " por noche - "
                + (disponible ? "Disponible" : "Ocupada");
    }
}


