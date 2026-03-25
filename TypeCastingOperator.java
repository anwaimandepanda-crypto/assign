public class TypeCastingOperator {
    public static void main(String[] args) {
        double d=9.78;
        int num = (int)d;
        System.out.println("Double value before conversion: "+d);
        System.out.println("After explicit type conversion: "+num);
        int i=20;
        double n =i;
        System.out.println("Double value before conversion: "+i);
        System.out.println("After implicit type conversion: "+n);
      
    }
}
