package polymorphism;

public class MainPolymorphismClass {
    public static void main(String[] args) {

        PerformSum performSum1 = new PerformSum();
        performSum1.sum(2, 3);
        performSum1.sum(4, 5, 6);
        performSum1.sum(2, 4.56f);
        performSum1.sum(5.65, 4.35f);
        performSum1.sum(6.45f, 5.55f);
        performSum1.sum(3.85, 5.15);
    }
}

