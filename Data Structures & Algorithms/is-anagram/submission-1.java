class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> charCount = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            charCount.put(c , charCount.getOrDefault(c, 0) + 1);
        }

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            charCount.put(c , charCount.getOrDefault(c, 0) - 1);
        }

        for(char c : charCount.keySet()){
            if(charCount.get(c) != 0){
                return false;
            }
        }

        return true;
    }
}
