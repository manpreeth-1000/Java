import java.util.*;
public class p33 {
    public static void print(int n) {
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
