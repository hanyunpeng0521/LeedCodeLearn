package leetcode.week02.day03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyp
 * Project name is LeedCodeLearn
 * Include in leetcode.week02.day03
 * hyp create at 20-3-21
 **/
public class Partition {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, s, new ArrayList<String>());
        return res;

    }

    private void backtrack(List<List<String>> res, String s, ArrayList<String> tmp) {
        if (s == null || s.length() == 0) res.add(new ArrayList<>(tmp));
        for (int i = 1; i <= s.length(); i++) {
            if (isPalidrome(s.substring(0, i))) {
                // System.out.println(s.substring(0, i));
                tmp.add(s.substring(0, i));
                backtrack(res, s.substring(i, s.length()), tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private boolean isPalidrome(String sb) {
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }

}
