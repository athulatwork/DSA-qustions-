class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Initialize frequency array for 26 lowercase English letters
        int[] freq = new int[26];
        
        // Step 2: First pass - Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Step 3: Second pass - Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // Return its 0-based index
            }
        }
        
        // Step 4: If no unique character exists, return -1
        return -1;
    }
}
