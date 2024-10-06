import java.util.Scanner;
public class p44 {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int index, String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        String mapping = keypad[str.charAt(index)-'0'];
        for(int i=0; i<mapping.length(); i++){
            printComb(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printComb(str,0,"");
    }
}
