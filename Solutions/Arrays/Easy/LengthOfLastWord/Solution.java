package LengthOfLastWord;

public class Solution {
    /*
    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.
    */
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        int max = stringArray.length-1;
        return stringArray[max].length();
    }
}
