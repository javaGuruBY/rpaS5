package by.jrr.bean;

import java.util.Objects;

public class Encoder {

    public static char encode(short code) {
        return (char) code;
    }

    public static short decode(char symbol) {
        return (short) symbol;
    }


}
