import java.util.Scanner;

public class Car {
    String brand;
    String model;
    int speed=0;
    void acc(){
        speed=speed+5;
        System.out.println(brand+" Accelarating "+speed);
    }
    void brake(){
        if(speed>0){
            speed=speed-5;
            System.out.println(brand+" Slowing Down "+speed);
        }
    }
    void setter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car brand: ");
        brand=sc.nextLine();
        System.out.println("Enter the car model: ");
        model = sc.nextLine();

    }
    public static void main(String[] args) {
        Car c1 = new Car();
        // c1.brand = "BMW";
        // Car c2 = new Car();
        // c2.brand="Audi";
        // System.out.println(c1.brand);
        // System.out.println(c2.brand);

        // c1.acc();
        // c2.acc();
        // c1.brake();
        // c2.brake();
        // c1.brake();
        // c2.brake();
        c1.setter();
        System.out.println(c1.brand);
    }
}