public class p41 {
    public static int first = -1 , last = -1;
    public static void fl(String str, char ch, int index){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(index)==ch){
            if(first==-1){
                first=index;
            }
            last=index;
        }
        fl(str, ch , index+1);
    }
    public static void main(String[] args) {
        String str = "oabdaj";
        fl(str,'a',0);
    }
}
