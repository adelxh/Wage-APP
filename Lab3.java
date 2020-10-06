import java.util.Scanner; 

public class Lab3 {

    public static void main(String[] args) {

        Employee();

    }

    public static void Employee() {
        Scanner input = new Scanner(System.in);
        boolean tr = true;
    System.out.println();
        System.out.println("Wage APP"); 
        System.out.println("-------------");
        System.out.println("choose your status: ");
        System.out.println("Commision employee");
        System.out.println("Salaried employee");
        System.out.println("Hourly employee");
        System.out.println("Base plus Commision employee");
        int chooseStatus = input.nextInt();
do {
        switch(chooseStatus) {

            case 1: 
                CommissionEmployee(); 
                break; 
            
            case 2: 
                SalariedEmployee(); 
                break;
                
            case 3:
                HourlyEmployee();
                break;
                
            case 4: 
                BasePlusCommissionEmployee(); 
                break; 

            default:
            tr = false;
            break;
        }
    } while(tr == true);
    
   }


   public static void CommissionEmployee() {
       double grossSales; 
       double commissionRate;

   }


}

