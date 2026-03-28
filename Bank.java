import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bal=1000, dp;
        String name;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter Deposit amount: ");
        dp = sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("The balance after depositing is: "+(Bal=Bal+dp));
        sc.close();
    }
}
