import java.util.Scanner;
public class p37 {
    public static void fib(int a,int b,int n){
        if(n==0){
            return;
        }
        b=a+b;
        a=b-a;
        System.out.println(b);
        fib(a,b,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fib(a,b,n-2);
    }
}
