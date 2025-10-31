package Hotel;

public class Reserva {
        private String id;              // Identificador de la reserva
        private Huesped huesped;        // El huésped que hizo la reserva
        private Habitacion habitacion;  // La habitación reservada
        private int noches;             // Número de noches reservadas
        private double costoTotal;      // Costo total calculado

        /**
         * Constructor que inicializa los datos de la reserva.
         */
        public Reserva(String id, Huesped huesped, Habitacion habitacion, int noches) {
            this.id = id;
            this.huesped = huesped;
            this.habitacion = habitacion;
            this.noches = noches;
        }

        /**
         * Calcula el costo total de la reserva.
         */
        public void calcularTotal() {
            costoTotal = habitacion.getPrecioPorNoche() * noches;
        }

        /**
         * Confirma la reserva solo si la habitación está disponible.
         * Cambia el estado de la habitación y calcula el costo.
         */
        public void confirmar() {
            if (habitacion.isDisponible()) {
                habitacion.reservar(); // cambia a ocupada
                calcularTotal();       // calcula el total
                System.out.println("Reserva confirmada para " + huesped.getNombre() + " en " + habitacion);
            } else {
                System.out.println("La habitación no está disponible.");
            }
        }

        // Métodos de acceso
        public double getCostoTotal() { return costoTotal; }
        public Huesped getHuesped() { return huesped; }
        public Habitacion getHabitacion() { return habitacion; }

        @Override
        public String toString() {
            return "Reserva " + id + ": " + huesped.getNombre() + " -> Habitación " + habitacion.getNumero() +
                    " (" + noches + " noches, $" + costoTotal + ")";
        }
    }


