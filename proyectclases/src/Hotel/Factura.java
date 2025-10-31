package Hotel;
    /**
     * Clase que representa una factura generada después de confirmar una reserva.
     * Está compuesta por una Reserva.
     */
    public class Factura {
        private Reserva reserva;
        private double monto;

        /**
         * Constructor que genera la factura con base en una reserva existente.
         */
        public Factura(Reserva reserva) {
            this.reserva = reserva;
            this.monto = reserva.getCostoTotal();
        }

        /**
         * Imprime la factura con la información principal.
         */
        public void imprimirFactura() {
            System.out.println("---- FACTURA ----");
            System.out.println("Huésped: " + reserva.getHuesped().getNombre());
            System.out.println("Habitación: " + reserva.getHabitacion().getNumero());
            System.out.println("Total a pagar: $" + monto);
            System.out.println("-----------------");
        }
    }
