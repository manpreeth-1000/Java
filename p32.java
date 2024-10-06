public class p32 {
    public static void main(String[] args) {
        int[] arr = {7,3,5,1,9};
        int len = arr.length;
        for(int i=1;i<len;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
    }
}
