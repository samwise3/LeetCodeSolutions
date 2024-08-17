package Solutions.TwoPointers.Easy;

public class EasySolutions {
    
    /* 
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric 
    characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. 
    
    Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.equals(" ") || s.length() == 1) {
            return true;
        }
        char[] array = s.toCharArray();
        int right = array.length-1;
        outerLoop:
        for(int left = 0; left<=right; left++) {
            char leftChar;
            char rightChar;
            // loop through until left pointer is at an alphanumeric
            while(!Character.isLetterOrDigit(array[left])) {
                left++;
                if(left>right) {
                break outerLoop;
            }
            }
            // loop through until right pointer is at an alphanumeric
            while(!Character.isLetterOrDigit(array[right])) {
                right--;
                if(left>right) {
                break outerLoop;
            }
            }
            
            leftChar = Character.toLowerCase(array[left]);
            rightChar = Character.toLowerCase(array[right]);
            if(leftChar != rightChar) {
                return false;
            }
            right--;
        }
        return true;
    }
}
