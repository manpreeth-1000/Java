import java.util.*;
public class p15 {
    public static int addFunc(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),sum=addFunc(a,b);
        System.out.println(sum);
    }
}