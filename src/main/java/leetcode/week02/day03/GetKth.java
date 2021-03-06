package leetcode.week02.day03;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/sort-integers-by-the-power-value/
 *
 * @author hyp
 * Project name is LeedCodeLearn
 * Include in leetcode.week02.day03
 * hyp create at 20-3-22
 **/
public class GetKth {
    private Map<Integer, Integer> memo;

    private int getWeight(int num) {
        if (num == 1) {
            return 0;
        }

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int count = (num & 1) == 0 ? getWeight(num >>> 1) : getWeight(3 * num + 1);
        count++;
        memo.put(num, count);
        return count;
    }

    public int getKth(int lo, int hi, int k) {
        // int[] = {值，权重}
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] == o2[1] ? o2[0] - o1[0] : o2[1] - o1[1]);
        memo = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            heap.offer(new int[]{i, getWeight(i)});
            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.peek()[0];
    }
}
