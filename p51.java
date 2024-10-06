// OOPs constructors and polymorphism
class Student{
    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
    }

    public void printInfo(){
        System.out.println(name + "  " + roll);
    }
}
public class p51 {
    public static void main(String[] args) {
        Student s1 = new Student("Manu",24);
        s1.printInfo();
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
