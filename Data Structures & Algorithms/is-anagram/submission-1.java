class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

Map<Character, Integer> sortedMap = new HashMap<Character, Integer>();
        for(Character c: s.toCharArray()) {
        sortedMap.put(c, sortedMap.getOrDefault(c, 0) +1);
        } 
        for(Character c: t.toCharArray()) {
            sortedMap.put(c, sortedMap.getOrDefault(c, 0) -1);
        }
        for(int value: sortedMap.values()) {
            if(value!=0) {
                return false;
            }
        }
        return true;
    }
}
