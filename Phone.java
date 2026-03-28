public class Phone {
    String brand = "apple";
    String model = "17 pro max";
    void call(){
        System.out.println("calling from "+this.model);
    } 
    void msg(){
        System.out.println("Texting from "+this.brand);
    }
    
public static void main(String[] args) {
    Phone p1= new Phone();
    p1.call();
    p1.msg();
}
}