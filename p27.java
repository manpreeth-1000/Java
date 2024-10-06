import java.util.*;
public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[5];
        int sum=0;
        for(int i=0;i<5;i++){
            strArr[i]=sc.nextLine();
            sum+=strArr[i].length();
        }
        System.out.println(sum);
    }
}
