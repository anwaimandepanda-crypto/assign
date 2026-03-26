import java.util.Scanner;

public class ElseIf {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks;
    System.out.println("Enter the marks: ");
    marks = sc.nextInt();
    if(marks>90 && marks<=100)
        System.out.println("A Grade");
    else if (marks>80 && marks<=90) {
        System.out.println("B Grade");
    }else if (marks>70 && marks<=80) {
        System.out.println("C Grade");
    }else
        System.out.println("Fail");
    sc.close();
}
}
