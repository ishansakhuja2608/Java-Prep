class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Add each character in the hashset, if it's not in the set, add that and update the result as size of the set, 
        // set already contains the character, remove that, cause we have to look for non repeating characters.
        int i = 0;
        int j = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(set.size(), maxLen);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}