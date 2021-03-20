package by.jrr.start;

public class EncoderDemo {

    public static void main(String[] args){
        Encoder encoder = new Encoder();
        System.out.println(encoder.encode(65));
        System.out.println(encoder.encode('X'));

    }
}
