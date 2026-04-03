class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagramListS = new HashMap<>();
        HashMap<Character, Integer> anagramListT = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            anagramListS.put(s.charAt(i), anagramListS.getOrDefault(s.charAt(i), 0) + 1);
            anagramListT.put(t.charAt(i), anagramListT.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        return anagramListS.equals(anagramListT);
    }
    
}
