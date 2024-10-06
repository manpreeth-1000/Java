public class p39 {
    public static void towerOfHanoi(int n,char S,char H,char D){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, S, D, H);
        System.out.println("disk "+n+" from "+S+" to "+D);
        towerOfHanoi(n-1, H, S, D);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,'S','H','D');
    }
}
