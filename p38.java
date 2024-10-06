public class p38 {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(x,n/2)*pow(x,n/2);
        }
        else{
            return pow(x,n/2)*pow(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=6;
        int res=pow(x,n);
        System.out.println(res);
    }
}
