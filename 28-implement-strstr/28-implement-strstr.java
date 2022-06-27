class Solution {
    public int strStr(String haystack, String needle) {
        // check for the substring of that particular length of needle in the haystack
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l1 < l2)
            return -1;
        else if(l2 == 0)
            return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}