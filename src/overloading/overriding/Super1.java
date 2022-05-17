package overloading.overriding;

public class Super1 extends Super {
    float sal;
    Super1(int id, String name, float sal){
        super(id, name);
        this.sal = sal;
    }
    void display(){
        System.out.println(+id+" "+name+" "+sal);
    }
}
