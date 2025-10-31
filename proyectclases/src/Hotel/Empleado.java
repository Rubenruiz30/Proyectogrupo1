package Hotel;
    public class Employee extends Person {
        private String position;

        public Employee(String id, String name, String phone, String position) {
            super(id, name, phone);
            this.position = position;
        }

        public String getPosition() { return position; }
        public void setPosition(String position) { this.position = position; }
    }


