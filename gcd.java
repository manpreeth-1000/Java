import java.util.Scanner;

public class gcd {
    public static int findGcd(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return findGcd(a-b, b);
        }
        return findGcd(a , b-a);
    }

    public static int findGcdWR(int a, int b, int lower, int upper){
        int res = findGcd(a,b);
        for(int i=upper; i>=lower; i--){
            if(res%i == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int result = findGcdWR(a,b,lower,upper);
        System.out.println(result);
        
    }
}
