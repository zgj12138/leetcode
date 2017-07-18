package july2017;
/**
 * 海明距离
 * 给出任意两个数，计算这两个数的海明距离
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ?   ?
 *  有两位不同，所以结果是2
 * @author ZGJ
 * @date 2017年7月7日 下午6:19:12
 */
public class Question461 {
	/**
	 * 一行代码搞定，这个有点作弊嫌疑
	 * 将两个数进行异或运算，异或运算相同为0，不同为1，再统计得到的结果后的1是数量
	 * @param x
	 * @param y
	 * @return
	 */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    /**
     * 也是利用异或运算，再统计位数为1的个数
     * 右移一位，最后一位与1相与，统计1的个数
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance1(int x, int y) {
        int xor = x ^ y, count = 0;
        for (int i=0;i<32;i++)
        	count += (xor >> i) & 1;
        return count;
    }
}
