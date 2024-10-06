public class p31 {
    public static void main(String[] args) {
        int[] arr = {9,3,5,1,2};
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int min = i ;
            for(int j=i+1;j<len;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }

    }
}
