public class p25 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1};
        char sorted = 'y';
        for(int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                sorted='n';
                break;
            }
        }
        if(sorted=='y'){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}