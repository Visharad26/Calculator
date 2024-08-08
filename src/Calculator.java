import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
       int operator ;
       double n1;
       double n2;

       System.out.println("\n 1 - Add \n 2 - Subtract \n 3 - Multiplication \n 4 - Divison");

       System.out.print("Choose Operator: ");

       Scanner sc = new Scanner(System.in);
       operator = sc.nextInt();
       
       System.out.print("Enter first number: ");
       n1 = sc.nextDouble();
       
       System.out.print("Enter second number: ");
       n2 = sc.nextDouble();
       
       sc.close();
        
       double result = 0;
        
       switch (operator) {
        case 1:
            result = n1 + n2;
            break;
       
        case 2:
            result = n1 - n2;
            break;
        case 3:
            result = n1 * n2;
            break;
        case 4:
            result = n1 / n2;
            break;
        default:
            System.out.println("Entered operator is not valid");
            break;
       }

       System.out.print("Result: " + result);
    }
}
