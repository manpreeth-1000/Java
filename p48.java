public class p48 {
    public static int ways(int n){
        if(n<=1){
            return 1;
        }
        return (ways(n-1) + (n-1)*ways(n-2));
    }
    public static void main(String[] args) {
        int n = 3;
        int ways = ways(n);
        System.out.println(ways);
    }
}
