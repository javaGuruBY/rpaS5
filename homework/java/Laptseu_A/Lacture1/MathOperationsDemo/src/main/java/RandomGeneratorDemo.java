import java.util.Random;

public class RandomGeneratorDemo {






    public static void main(String[] args) {
        RandomGeneratorDemo example = new RandomGeneratorDemo();

        double a = example.getRandomDoubleMATH();
        double b = example.getRandomDoubleMATH();
        double c = example.getRandomDoubleMATH();
        double a1 = example.getRandomDoubleRANDOM();
        double b1 = example.getRandomDoubleRANDOM();
        double c1 = example.getRandomDoubleRANDOM();

        System.out.println("3 случайных числа: "+a+", "+b+", "+c);
        System.out.println("Сумма: "+(a+b+c));
        System.out.println("-------------------------");
        System.out.println("3 случайных числа: "+a1+", "+b1+", "+c1);
        System.out.println("Сумма: "+(a1+b1+c1));



    }




    public double getRandomDoubleMATH(){
        return Math.random();
    }

    public double getRandomDoubleRANDOM(){
        Random random = new Random();

        return random.nextDouble();
    }










}
