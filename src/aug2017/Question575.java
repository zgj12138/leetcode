package aug2017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Distribute Candies
 * 分糖果，给定一个数组，数组的每个数字代表一种糖果，数字出现一次代表一个糖果
 * 现在要将糖果平均分给弟弟妹妹。使得妹妹分得糖果的种类最多，返回妹妹分得的种类的最大数
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * Input: candies = [1,1,2,3]
 * Output: 2
 * @author ZGJ
 * @date 2017年8月4日
 */
public class Question575 {
	/**
	 * Java8的解法，boxed()装箱
	 * 糖果是种类/2和糖果的种类对比，哪个小取哪个
	 * @param candies
	 * @return
	 */
    public int distributeCandies1(int[] candies) {
        return Math.min(candies.length / 2, IntStream.of(candies).boxed().collect(Collectors.toSet()).size());
    }
    /**
     * 方法同上
     * @param candies
     * @return
     */
    public int distributeCandies2(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
    /**
     * 先排序，如果后面的比前面大，就加1
     * @param candies
     * @return
     */
    public int distributeCandies3(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for (int i = 1; i < candies.length && count < candies.length / 2; i++)
            if (candies[i] > candies[i - 1])
                count++;
        return count;
    }
    /**
     * 两重循环遍历数组，获取当前值，往后遍历，如果相同的，则设置为Integer的最大值
     * @param candies
     * @return
     */
    public int distributeCandies4(int[] candies) {
        int count = 0;
        for (int i = 0; i < candies.length && count < candies.length / 2; i++) {
            if (candies[i] != Integer.MIN_VALUE) {
                count++;
                for (int j = i + 1; j < candies.length; j++) {
                    if (candies[j] == candies[i])
                        candies[j] = Integer.MIN_VALUE;
                }
            }
        }
        return count;
    }
}
