package leetcode;

import java.util.*;

public class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordset = new HashSet<>(wordDict);
        List<String> partial = new ArrayList<>();
        List<String> result = new ArrayList<>();
        rec(s, wordset, result, partial);
        return result;
    }

    private void rec(String s, Set<String> wordset, List<String> result, List<String> partial) {
        if (s.isEmpty()) {
            String tempRes = String.join(" ", partial);
            result.add(tempRes);
            return;
        }
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp = temp + s.charAt(i);
            if (wordset.contains(temp)) {
                partial.add(temp);
                rec(s.substring(i + 1), wordset, result, partial);
                partial.remove(partial.size() - 1);
            }
        }
    }
}
