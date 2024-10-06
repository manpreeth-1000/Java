public class p49{
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] newArr = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        while(index1<=mid && index2<=ei){
            if(arr[index1]<arr[index2]){
                newArr[x]=arr[index1];
                x++;index1++;
            }
            else{
                newArr[x]=arr[index2];
                x++;index2++;
            }
        }
        while(index1<=mid){
            newArr[x++]=arr[index1++];
        }
        while(index2<=ei){
            newArr[x++]=arr[index2++];
        }
        for(int i=0,j=si;i<ei-si+1;i++,j++){
            arr[j]=newArr[i];
        }

    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si + ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        divide(arr,0,5);
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}