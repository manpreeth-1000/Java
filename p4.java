//pyramid
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
