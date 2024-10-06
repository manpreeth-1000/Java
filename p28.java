public class p28 {
    public static void main(String[] args) {
        String str = new String("Tony");
        String str1 = new String("Tony");
        String str2 = "Tony";
        String str3 = "Tony";
        str3 = str3 + "o";

        System.out.println(str);
        if(str2==str3){
            System.out.println("eq");
        }
        System.out.println(str3);
    }
}
