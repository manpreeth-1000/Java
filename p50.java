// OOPs
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Written");
    }
    public void printColor(String str){
        System.out.println(str+this.color);
    }
}
public class p50 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ball";
        pen1.write();
        pen1.printColor("This is ");
    }
}
