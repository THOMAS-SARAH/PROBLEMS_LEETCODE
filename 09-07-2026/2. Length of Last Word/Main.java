class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        
        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int len = 0;

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
