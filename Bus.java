public class Bus {
    Bus(String b, String m){
        System.out.println("Bus is created..");
        System.out.println("the brand is: "+b);
        System.out.println("the model is "+m);
    }
    

    
    public static void main(String[] args) {
        Bus b= new Bus("omni","pro");
    }
}
