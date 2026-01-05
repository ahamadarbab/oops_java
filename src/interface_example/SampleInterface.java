package interface_example;

public interface SampleInterface {

    //inside an interface, all the variables are public static final

    public int abc = 100;   //public static final int abc = 100;
    int xyz = 900;    //public static final int xyz = 900;
    public static int mno = 500;    //public static final int mno = 500;
    public static final int pqr = 400;    //public static final int pqr = 400;

    //inside an interface, all the methods are abstract by default

    public void sample1();    //public abstract void sample1();
    public abstract void sample2();    //public abstract void sample2();
    void sample3();    //public abstract void sample3();

    public abstract void sample6();

}
