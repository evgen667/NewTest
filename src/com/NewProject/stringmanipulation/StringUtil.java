package com.NewProject.stringmanipulation;

public class StringUtil {

    public static void main(String[] args) {
        String source = "Hello World!";

       String[] words = source.split(" ");

        //source.split(" ");
       System.out.println(words.length);
        System.out.println(words[0]);
        char[] letters = words[0].toCharArray();
        System.out.println(words[1]);

    }
}