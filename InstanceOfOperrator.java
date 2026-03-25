class Animal{
}
public class InstanceOfOperrator {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal as = new Animal();
        System.out.println(an instanceof Animal);
        System.out.println(as instanceof Animal);
    }
}
