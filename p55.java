import java.util.HashMap;
import java.util.Scanner;

public class p55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sunday",1);
        map.put("Monday",2);
        map.put("Tuesday",3);
        map.put("Wednesday",4);
        map.put("Thursday",5);
        map.put("Friday",6);
        map.put("Saturday",7);

        String dayS = sc.nextLine();
        int day = map.get(dayS);
        int date = sc.nextInt();
        int c=0;
        for(int i=day; i<=date+day; i++){
            if(i==1 || i==8 || i==15 || i==22 || i==29){
                c++;
            }
        }
        System.out.println(c);
    }
}