package Hotel;
import Hotel.modelo.*;
public class HotellApp {


    /**
     * Clase principal del sistema del hotel.
     * Aquí se hace una pequeña demostración del funcionamiento del programa.
     */
    public class HotelApp {
        public static void main(String[] args) {
            // Crear habitaciones del hotel
            Habitacion h1 = new Habitacion(101, "Individual", 80);
            Habitacion h2 = new Habitacion(102, "Doble", 120);

            // Crear un huésped
            Huesped huesped1 = new Huesped("H001", "Ana Pérez", "555-1234", "ana@gmail.com");

            // Mostrar el estado inicial de las habitaciones
            System.out.println("Estado inicial de las habitaciones:");
            System.out.println(h1);
            System.out.println(h2);
            // Crear una reserva
            Reserva r1 = new Reserva("R001", huesped1, h1, 3);

            // Confirmar la reserva (marca la habitación como ocupada)
            r1.confirmar();

            // Generar una factura para la reserva
            Factura f1 = new Factura(r1);
            f1.imprimirFactura();

            // Mostrar estado final de la habitación
            System.out.println("\nEstado de la habitación después de reservar:");
            System.out.println(h1);
        }
    }
}
