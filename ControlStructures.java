import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //   System.out.println("Enter Your Age");
    //   int age= sc.nextInt();
    //   if (age>=18) {
    //     System.out.println("Eligible for voting");
    //   sc.close();  
    //   }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
        System.out.println("Enter the second number");
    int b = sc.nextInt();
        if(a>b)
            System.out.println("First number is larger");
        else
        System.out.println("Second number is larger");
    }    
}
