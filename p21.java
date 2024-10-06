import java.util.*;
public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] array = {1,2,5,4,5};
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                System.out.println(i);
            }
        }
    }
}
