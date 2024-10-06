import java.util.*;
public class p17 {
    public static String func(int age){
        if(age<18){
            return "Not eligible";
        }
        else{
            return "Eligible";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String eon = func(age);
        System.out.println(eon);
    }
}
