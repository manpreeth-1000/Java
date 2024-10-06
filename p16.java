//factorial

import java.util.*;
public class p16 {
    public static void factorial(int n){
        int f=1;
        for(int i=2;i<=n;i++){
            f*=i;
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}
