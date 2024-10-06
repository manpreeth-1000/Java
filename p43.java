public class p43 {
    public static void subStrings(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        subStrings(str, index+1, newString+str.charAt(index));
        subStrings(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subStrings(str, 0, "");
    }
}