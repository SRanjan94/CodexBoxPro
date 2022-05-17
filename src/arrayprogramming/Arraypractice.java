package arrayprogramming;

public class Arraypractice {
    public int rollno;
    public String name;

    Arraypractice(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        Arraypractice[] a; //declare an array
        a = new Arraypractice[5];
        a[0] = new Arraypractice(1, "rocky");
        a[1] = new Arraypractice(2, "subha");
        a[2] = new Arraypractice(3, "lucky");
        a[3] = new Arraypractice(4, "vinki");
        a[4] = new Arraypractice(5, "kapil");
        for (int i = 0; i < a.length; i++) {
            if (a[i].name == "rocky" || a[i].rollno == 2) {
                System.out.println("print array:"+a[i].rollno+" "+a[i].name);    //it will be print only 1 and 2
            } else {
                System.out.println("show error:");
                //System.out.println("print array:"+a[i].rollno+" "+a[i].name);
            }
        }


    }
}

