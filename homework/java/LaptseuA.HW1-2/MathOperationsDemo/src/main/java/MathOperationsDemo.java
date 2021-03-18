


public class MathOperationsDemo {

    int intA, intB;
    double doubleA, doubleB;
    double doublenew;


    public static void main(String[] args) {

        MathOperationsDemo example = new MathOperationsDemo(10, 20, 30, 40);

        example.SummingFunction(5, 6);
        example.SummingFunction(example.getIntA(), example.getIntB());
        System.out.println();
        example.SubtractionFunction(5, 6);
        example.SubtractionFunction(example.getIntA(), example.getIntB());

        System.out.println();
        System.out.println();
        example.MultiplicationFunction(5, 6);
        example.MultiplicationFunction(example.getIntA(), example.getIntB());
        System.out.println();
        example.SegmentationFunction(5, 6);
        example.SegmentationFunction(example.getIntA(), example.getIntB());
        System.out.println();


    }

    public void SummingFunction(int a, int b) {
        System.out.println(a + b);
    }

    public void SubtractionFunction(int a, int b) {
        System.out.println(a - b);
    }

    public void MultiplicationFunction(int a, int b) {
        System.out.println(a * b);
    }

    public void SegmentationFunction(int a, int b) {
        System.out.println((double) a / (double) b);
    }

    public int getIntA() {
        return intA;
    }

    public int getIntB() {
        return intB;
    }

    public double getDoubleA() {
        return doubleA;
    }

    public double getDoubleB() {
        return doubleB;
    }


    public MathOperationsDemo(int intA, int intB, double doubleA, double doubleB) {
        this.intA = intA;
        this.intB = intB;
        this.doubleA = doubleA;
        this.doubleB = doubleB;
    }


}
