package classes_objects;

public class Demo {

    public int abc = 100;   // non-static variable, object is required
    public static int xyz = 200;    // static variable, object is not required

    public void demo1() {   // if non-static method then we can use both static and non-static variables/methods inside it
        abc = 400;
        xyz = 500;
        System.out.println("demo1 non-static method");
    }

    public static void demo2() {    // if static method then we can only use static variables/methods inside it
       // abc = 400;   since it is non-static we cannot use here
        xyz = 500;
        System.out.println("demo2 static method");
    }
}
