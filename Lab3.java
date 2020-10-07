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

   

   
}

 
   