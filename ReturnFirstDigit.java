    import java.util.Scanner;

public class ReturnFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fd;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        fd=n/10;
        System.out.println("The first digit of the number is "+fd);
        sc.close();
    }
}


