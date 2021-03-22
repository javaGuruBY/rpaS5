package by.jrr.bean;

import java.util.Objects;

public class Encoder {

    short number;
    char symbol;

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return number == encoder.number &&
                symbol == encoder.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, symbol);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "number=" + number +
                ", symbol=" + symbol +
                '}';
    }
}
