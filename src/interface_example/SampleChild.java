package interface_example;

public class SampleChild implements SampleInterface, SampleInterface2 {

    @Override
    public void sample1() {
        System.out.println("sample1 method implementation in child class");
        System.out.println("abc is : " + SampleInterface.abc);
    }

    @Override
    public void sample2() {
        System.out.println("sample2 method implementation in child class");
        System.out.println("xyz is : " + SampleInterface.xyz);
    }

    @Override
    public void sample3() {
        System.out.println("sample3 method implementation in child class");
        System.out.println("mno is : " + SampleInterface.mno);
        System.out.println("pqr is : " + SampleInterface.pqr);
    }

    @Override
    public void sample5() {
        System.out.println("sample5 method implementation in child class");
    }

    @Override
    public void sample6() {
        System.out.println("sample6 method implementation in child class");
    }
}
