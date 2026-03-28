public class NestedLoop {
    public static void main(String[] args) {
        String arr[]={"Tiger","Lion","Dog"};
        for (int i=0;i<1;i++) {
            System.out.println(arr[i]);
            for(int j=1;j<2;j++)
                System.out.println(arr[j]);
                for(int k=2;k<3;k++)
                     System.out.println(arr[k]);

        }
    }
}
