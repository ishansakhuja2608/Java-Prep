class Solution {
    public boolean isPalindrome(String s) {
        /*
        Check whether the given character is letter or not, if not, move to next character, 
        Convert that character to lower case and check whether it's equal to the character on the other side
        if not, return false, at the end, return true
        */
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) 
                start++;
            while(start < end && !Character.isLetterOrDigit(s.charAt(end)))
                end--;
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;;
            end--;
        }
        return true;
    }
}
