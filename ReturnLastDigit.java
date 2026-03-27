import java.util.Scanner;

public class ReturnLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ld;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        ld=n%10;
        System.out.println("The last digit of the number is "+ld);
        sc.close();
    }
}
