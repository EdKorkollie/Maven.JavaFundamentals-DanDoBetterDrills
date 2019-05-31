package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        String word = (new StringBuilder()).append(firstSegment).append(secondSegment).toString();
        return word;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String word = (new StringBuilder()).append(firstSegment).append(secondSegment).toString();
        return word;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String word = input.substring(0, 3);

        return word;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String word = input.substring(2, 5);
        return word;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        if (inputValue == comparableValue)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){

        int len = inputValue.length();
        int i = len/2;
        char ch[] = inputValue.toCharArray();

        if (len%2 == 1)
        {
            return ch[i];
        }
        else
        {
            return ch[i-1];
        }

    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String array[] = spaceDelimitedString.split(" ", 2);
        String word1 = array[0];
        return word1;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String array[] = spaceDelimitedString.split(" ", 2);
        String word2 = array[1];

        return word2;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reverse = "";
        for (int i = stringToReverse.length()-1; i>=0; i-- )
        {
            reverse = reverse + stringToReverse.charAt(i);
        }
        return reverse;
    }
}
