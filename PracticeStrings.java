package com.company;

public class PracticeStrings {
    public static void main(String[]args){
        // Q1. Convert a string to lowercase
        //String name = "PREM";
        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        // Q2. Replace spaces with the underscores
        //String text = "To Lower Case";
        //System.out.println(text.replace(' ','_'));

        // Q3. letter = "dear <|name|>, Thanks a lot"
        //     replace = <|name|> with a string (some name)
        String letter = "Dear <|name>|, Thanks a lot";
        letter = letter.replace("<|name|>", "PREM");
        System.out.println(letter);


    }

}


