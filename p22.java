import java.util.*;
public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
