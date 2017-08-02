package jul2017;

import java.util.Arrays;

/**
 * Array Partition I
 * 给定一个2n个整数的数组，你的任务是将这些整数分成n对整数，例如(a1, b1), (a2, b2), ..., (an, bn)
 * 使所有i从1到n 的最小(ai, bi)的和尽可能大。
 * @author ZGJ
 * @date 2017年7月10日
 */
public class Question561 {
	/**
	 * 假设在每一对i，bi >= ai。
	 * 记Sm = min(a1, b1) + min(a2, b2) + ... + min(an, bn)。最大的Sm是这个问题的答案。鉴于1，Sm = a1 + a2 + ... + an。
	 * 记Sa = a1 + b1 + a2 + b2 + ... + an + bn。Sa对于给定的输入是恒定的。
	 * 记di = |ai - bi|。鉴于1，di = bi - ai。记Sd = d1 + d2 + ... + dn。
	 * 所以Sa = a1 + a1 + d1 + a2 + a2 + d2 + ... + an + an + di = 2Sm + Sd=> Sm = (Sa - Sd) / 2。要获得最大值Sm，给定值Sa是常数，我们需要Sd尽可能的小。
	 * 所以这个问题成了一个数组中的对，使得di（ai和之间的距离bi）之和尽可能的小。显然，相邻元素的距离之和是最小的。如果这不够直观，请参阅附图。情况1最小Sd。
	 * 
	 * 也即只要对这个数组进行排序，然后从第一个开始取，取每个的奇数位的和即可
	 */
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for(int i = 0; i < nums.length; i+=2) {
			result += nums[i];
		}
		return result;
	}
}
