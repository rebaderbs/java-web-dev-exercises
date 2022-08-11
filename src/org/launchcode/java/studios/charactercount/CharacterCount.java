package org.launchcode.java.studios.charactercount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class CharacterCount {
    public static void main(String[] args) {

//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> characterCountMap = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newString;
//        System.out.println("Enter a word or phrase: ");
//        newString = input.nextLine().toLowerCase();

        Path filePath = Path.of("/Users/rderbak/Desktop/Untitled.txt");
        String content = null;
        try {
            content = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String newString = content.toLowerCase();
//        System.out.println(newString);


        char[] charactersInString = newString.toCharArray();

        for (char c : charactersInString)   {
            if (characterCountMap.containsKey(c))   {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else  {
                characterCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : characterCountMap.entrySet())    {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//    Try these modifications on your code:
//
//        Prompt the user to enter the string in the command line.
//        Make the character counts case-insensitive.
//        Exclude non-alphabetic characters.

