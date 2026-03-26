public class NestedIf {
    public static void main(String[] args) {
        int age=5;
        if (age>=18) {
            if (age>=65) {
                System.out.println("You are Eligible to vote and avail goverment fund");
            
            }
            else
                System.out.println("You are eligible to vote but not eligible to avail goverment scheme");
        }else
            System.out.println("You are not eligible to vote and avail government funds");
    }
}
