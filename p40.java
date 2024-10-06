public class p40 {
    static void revPrint(String str){
        int len =str.length();
        if(len==1){
            System.out.print(str);
            return;
        }
        System.out.print(str.charAt(len-1));
        revPrint(str.substring(0, len-1));
    }
    public static void main(String[] args) {
        String str = "abcd";
        revPrint(str);
    }
}