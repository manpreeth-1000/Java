public class p26 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(array[i][j]==n){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}