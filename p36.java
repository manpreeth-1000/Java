public class p36 {
    public static void main(String[] args) {
        int n = 9;
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            b=a+b;
            a=b-a;
            System.out.println(b);
        }
    }
}
