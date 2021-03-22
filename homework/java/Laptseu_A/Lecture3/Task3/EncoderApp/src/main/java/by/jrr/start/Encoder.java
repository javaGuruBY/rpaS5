package by.jrr.start;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class Encoder {





     public void encode(short code){
         char ch = (char)code;
         System.out.println(ch);



     };

    public char encodeFOR_TEST(short code){
        return (char)code;




    };


    public void decode(char symbol){
        int in = symbol;
        System.out.println(in);
    };



}
