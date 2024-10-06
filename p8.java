import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),p;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                p=1;
            }
            else{
                p=0;
            }
            for(int j=0;j<i;j++){
                System.out.print(p);
                if(p==1){
                    p=0;
                }
                else{
                    p=1;
                }
            }
            System.out.println();
        }
    }
}
