import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Convert map to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Build result
        StringBuilder str = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            while (freq-- > 0) {
                str.append(ch);
            }
        }

        return str.toString();
    }
}