public class p46 {
    public static int paths (int i, int j, int n, int  m){
        if(i==n||j==n){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        return paths(i+1,j,n,m)+paths(i,j+1,n,m);
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int paths = paths(0,0,n,m);
        System.out.println(paths);
    }
}
