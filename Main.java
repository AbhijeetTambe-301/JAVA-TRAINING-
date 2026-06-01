import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENTER NO 1");
        int a = (new Scanner(System.in)).nextInt();
        System.out.println("ENTER NO 2");
        int b = (new Scanner(System.in)).nextInt();
        System.out.println("Enter your choice: ");
        int choice =(new Scanner(System.in)).nextInt();
        switch(choice){
           case 1:
           System.out.println("a + b = " + (a+b));
           break;
           case 2:
           System.out.println("a - b = " + (a-b));
           break;           
              case 3:     
              System.out.println("a * b = " + (a*b));
              break;
              case 4:
              System.out.println("a / b = " + (a/b));   
                break; 
                case 5:
                System.out.println("a % b = " + (a%b));
                break; 
                default:
                System.out.println("Invalid choice");   
        }
    }
}