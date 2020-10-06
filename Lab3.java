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
                // BasePlusCommissionEmployee(); 
                System.out.println("not the right option"); 
                break; 

            default:
            tr = false;
            break;
        }
    } while(tr == true);
    
   }


   public static void CommissionEmployee() {
       Scanner input = new Scanner(System.in); 
       double grossSales; 
       double commissionRate = 6.75;

       System.out.println("Enter gross Sales: ");
       grossSales = input.nextDouble();

    double result = grossSales * commissionRate; 
    System.out.println("your salary is: " + result);

   }

   public static void HourlyEmployee() {
       Scanner input = new Scanner(System.in);
       double wage; 
       double hours; 
       System.out.println("Please enter your wage: ");
       wage = input.nextDouble();
       System.out.println("Please enter how many hours you have worked: ");
       hours = input.nextDouble(); 
       double resultWage = wage * hours; 
       System.out.println("your salary for " + hours + " hours is $" + resultWage);

   }

   public static void SalariedEmployee() {
       Scanner input = new Scanner(System.in); 
       double weeklySalary; 

       System.out.println("please enter your weekly salary: ");
       weeklySalary = input.nextDouble(); 
       System.out.println("your weekly salary is: $" + weeklySalary);

   }

}

