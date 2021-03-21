package by.jrr.start;

public class Dog {

    private String name;
    private int age;
    private String color;


    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Dog() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void voice(){
        System.out.println(name+": Гав-Гав!!!");
    }
    public void eat(){
        System.out.println(name+ ": Ем");
    }
    public void sleep(){
        System.out.println(name+ ": Сплю");
    }


}
