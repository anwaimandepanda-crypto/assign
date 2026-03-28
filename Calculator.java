public class Calculator {
    String brand;
    String model;
    void add(int x,int y){
        //  x=100;y=200;
        System.out.println("The sum: "+(x+y));
    }
    void sub(int m,int n){
        // m=678;n=89;
        System.out.println("The difference "+(m-n));
    }
    void mul(int a,int b){
        // a=5;b=7;
        System.out.println("The multiplication is "+(a*b));
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(100,200);
        c.sub(567,79);
        c.mul(57,9);
    }
}
