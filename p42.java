public class p42 {
    public static boolean s(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return s(arr, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,100};
        if(s(arr,0)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
