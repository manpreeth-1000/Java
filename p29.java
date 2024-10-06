public class p29 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        int lastindex = str.length()-1;
        for(int i=0;i<(lastindex)/2;i++){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(lastindex-i));
            str.setCharAt(lastindex-i,temp);
        }
        System.out.println(str);
    }
}
