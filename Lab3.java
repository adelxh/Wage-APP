public interface Payable {

    double getPaymentAmount(); // get payment amount method only declared 

    public class Invoice implements Payable {

        private String partNum; 
        private String Partdescription; 
        private int partCount; 
        private double partPrice; 

        public Invoice(String part, String description, int count, double price) {

            partNum = part; 
            Partdescription = description; 
            partCount = count; 
            partPrice = price; 
        }

        // getter function for the num
        public String getPartNum(String part) {
            return part; 
            
        }

        // setter function for the num
        public void setPartNum(String part) {
           partNum = part; 
        }

        // getter function for description 
        public String getPartDescription(String description) {
            return description; 
        }

        // setter function for description 
        public void setPartDescription(String description) {
            Partdescription = description; 
        }

        public int getPartCount() {
            return partCount;
           
        }

        public void setPartCount(int count) {
            if (count >= 1) {
                partCount = count; 
            } else {
                throw new IllegalArgumentException("has to be above 0");
            }

        }

        // getter function for price 
        public Double getPartPrice() {
                return partPrice; 
        }

        // setter function for price 
        public void setPartPrice(double price) {

            if (partPrice > 0.0) {
                partPrice = price;
            }
            else {
                throw new IllegalArgumentException("enter price above 0.0");
            }
        }

       

       


        @Override
        public String toString() {
            return String.format("%s: \n\s:", "invoice", "part number", getPartNum(partNum), getPartDescription(Partdescription), "quantity", "price per item", getPartCount(), getPartPrice());
        }


        
        @Override
    public double getPaymentAmount() {
        return getPartCount() * getPartPrice(); 

    }




    }

        public abstract class Employee implements Payable {

            private String firstName;
            private String lastName; 
            private String socialSecurityNumber; 

            public void Emoloyee(String first, String last, String ssn) {
                firstName = first; 
                lastName = last; 
                socialSecurityNumber = ssn; 
           }

           // get function for the first name
           public String getFirstName() {

            return firstName; 
        }

        // set function for the first name 
        public void setFirstName(String first) {


            firstName = first;
        }

        // get function for the last name
        public String getLastName() {
            return lastName; 
        }

        // set function for the last name
        public void setLastName(String last){
            lastName = last;
        }

        // get function for ssn
        public String getSSN() {
            return socialSecurityNumber; 
        }


        // set function for ssn
        public void setSSN(String ssn) {
            socialSecurityNumber = ssn; 
        }

        @Override
        public String toString() {

            return String.format("%s %s\nSocial Security Number: %s", getFirstName(), getLastName(), getSSN()); 
        }

     }

     public class SalariedEmployee extends Employee {
        private double weeklySalary; 

        public SalariedEmployee(String first, String last, String ssn, double salary) {
            // super(first, last, ssn); 
            setWeeklySalary(salary); 
        }
        public void setWeeklySalary(double salary) {

            if (salary >= 0.0) {
                weeklySalary = salary; 
            }
            else {
                throw new IllegalArgumentException("number cannot be less than 0");

            }
            

            
        }

        public double getWeeklySalary() {
            return weeklySalary;
        }

        @Override
        public double getPaymentAmount() {
            // TODO Auto-generated method stub
            return getWeeklySalary();
        }

        @Override
        public String toString() {
            return String.format("salaried Employee: %s",super.toString(), " weekly salary ", getWeeklySalary());
        }

     }


     public class Tester {

        public static void main(String[] args) {

            Payable[] payObj = new Payable[5]; 

            payObj[0] = new Invoice("01234", "seat", 2, 375.54); 
            payObj[1] = new Invoice("34023", "table", 4, 254.54);
            payObj[2] = new Invoice("67953", "bicycle", 5, 143.56);
            payObj[3]= new SalariedEmployee("Adel", "Akhmed", "450-345-7559", 2500.00); 
            payObj[4]= new SalariedEmployee("John", "Smith", "768-450-6075", 1456.65); 
            System.out.println("Invoice and Employees Invoked: ");
            for (Payable currentPayable: payObj) {
                System.out.printf("%s \n%s: $$,.2f\n\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());



            }




        }
     }

    

        



   

   

   
}

 
   