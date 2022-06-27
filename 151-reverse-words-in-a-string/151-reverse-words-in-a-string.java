class Solution {
    public String reverseWords(String s) {
        // Start from last index, if that's a space, then move to next index, if it's not a space, store it in variable
        // move the i to next element which is not a space, concat that substring to the res.
        String res = "";
        int i = s.length()-1;
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) == ' ')
                i--;
            int j = i; // the index which is not a space
            if(i < 0)
                break;
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            if(res.isEmpty()) {
                res = res.concat(s.substring(i+1, j+1));
            } else {
                res = res.concat(" " + s.substring(i+1, j+1));
            }
        }
        return res;
    }
}