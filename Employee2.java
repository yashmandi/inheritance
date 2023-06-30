public class Employee2 extends Person {
        private int eid;
        private String jtitle;

        public Employee2(String firstName, String lastName, int eid, String jtitle) {
            super (firstName, lastName);
            this.eid = eid;
            this.jtitle = jtitle;
        } 

        public int getEid() {
            return eid;
        }
        
        public String getLastName() {
            return super.getLastName() + ", " + jtitle;
        }
} 