package aug2017;

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
}
