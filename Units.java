import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res;

        System.out.println("Enter the units: ");
        int units = sc.nextInt();
        if (units<=150) {
            res=units*1.5;
        }else
            res=units*3;
        System.out.println("The bill amount is: " + res);
        sc.close();
    }
}
