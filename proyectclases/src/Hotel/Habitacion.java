package Hotel;

public class Room {

        private int number;
        private String type;
        private double pricePerNight;
        private boolean available;

        public Room(int number, String type, double pricePerNight) {
            this.number = number;
            this.type = type;
            this.pricePerNight = pricePerNight;
            this.available = true;
        }

        public int getNumber() { return number; }
        public boolean isAvailable() { return available; }
        public double getPricePerNight() { return pricePerNight; }

        public void book() { this.available = false; }
        public void release() { this.available = true; }

        @Override
        public String toString() {
            return "Room " + number + " (" + type + ") $" + pricePerNight + "/night - "
                    + (available ? "Available" : "Occupied");
        }
    }

