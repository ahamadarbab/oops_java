package abstraction;

public class MainAbstractionClass {
    public static void main(String[] args) {

        //AbstractionDemo abstractionDemo = new AbstractionDemo();
        //we cannot create object for abstract classes, we have to create object for child class

        AbstractionChild abstractionChild = new AbstractionChild();

        abstractionChild.demo1();
        abstractionChild.demo2();
        abstractionChild.demo3();
        abstractionChild.demo4();
    }
}
