import java.util.Scanner; 

public class Lab3 {

    public static void main(String[] args) {

        Employee();

    }

    public static void Employee() {
        Scanner input = new Scanner(System.in);
    System.out.println();
        System.out.println("Wage APP"); 
        System.out.println("-------------");
        System.out.println("choose your status: ");
        System.out.println("Commision employee");
        System.out.println("Salaried employee");
        System.out.println("Hourly employee");
        System.out.println("Base plus Commision employee");
        int chooseStatus = input.nextInt();
    }
}

