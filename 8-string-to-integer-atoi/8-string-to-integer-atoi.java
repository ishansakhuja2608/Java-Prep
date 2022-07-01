class Solution {
    static final int maxDiv = Integer.MAX_VALUE / 10;
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        while(i < n && Character.isWhitespace(s.charAt(i)))
            i++;
        int sign = 1;
        if(i < n && s.charAt(i) == '+')
            i++;
        else if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        int num = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            if(num > maxDiv || num == maxDiv && digit >= 8) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num*10 + digit;
            i++;
        }
        return num*sign;
    }
}