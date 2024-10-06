// OOPs inheritane

class Shape{
    public void area(){
        System.out.println("area is : ");
    }
}
class Triangle extends Shape{
    public void area(int b , int h){
        System.out.println(0.5*b*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int b , int h){
        System.out.println(0.5*b*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class p52 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        EquilateralTriangle et1 = new EquilateralTriangle();
        t1.area(2,2);
        c1.area(2);
        et1.area(2,2);


    }
}
