public class ShiftOperator {
    public static void main(String[] args) {
        int x=8;
        System.out.println("Left shift:  " + (x << 1));
        System.out.println("Right Shift: " + (x>>1));
        System.err.println("Unsigned right shift: "+(x>>>2));
    }
}
