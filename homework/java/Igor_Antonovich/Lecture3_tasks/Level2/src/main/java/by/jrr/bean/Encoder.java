package by.jrr.bean;

public class Encoder {

    public static char encode(short code) {
        char result = (char) code;
        System.out.println(code + " => \'" + result + "\'");

        return result;
    }

    public static short decode(char symbol) {
        short result = (short) symbol;
        System.out.println(symbol + " => \'" + result + "\'");

        return result;
    }


}
