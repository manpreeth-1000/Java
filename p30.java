public class p30 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,8};
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
    }
}