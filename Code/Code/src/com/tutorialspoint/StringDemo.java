package com.tutorialspoint;
import java.lang.*;

public class StringDemo {
    public static void main(String[] args){

        String str = "a d, m, i.n";
        String delimiters = "\\s+|, \\s*|\\.\\s";

        String[] tokensVal = str.split(delimiters);

        System.out.println("Count of tokens = " + tokensVal.length);

        for(String token : tokensVal){
            System.out.print(token);
        }
    }
}
