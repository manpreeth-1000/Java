public class p45 {
    public static void allPermutations(String str, String permutaion){
        if(str.length()==1){
            System.out.println(permutaion+str);
        }
        for(int i=0;i<str.length();i++){
            allPermutations((str.substring(0,i)+str.substring(i+1,str.length())), permutaion+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        allPermutations(str,"");
    }
}