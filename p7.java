// floyds triangle
import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),p=1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
