package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();

        int j = array.length-1;
        for(int i=0; i<j; i++) {
            if(array[i] != array[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
