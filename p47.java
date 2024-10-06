//tiling problem of 1xm filling nxm
public class p47 {
    public static int noOfWay(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        return noOfWay(n-m, m)+noOfWay(n-1, m);
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int nof = noOfWay(n,m);
        System.out.println(nof);
    }
}