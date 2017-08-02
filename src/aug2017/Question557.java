package aug2017;
/**
 * 557 Reverse Words in a String III
 * 反转一个字符串中的单词
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * @author ZGJ
 * @date 2017年8月2日
 */
public class Question557 {
	/**
	 * 使用API中的分裂和反转功能
	 * @param s
	 * @return
	 */
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words) {
        	res.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
    
    public String reverseWords1(String input) {
        final StringBuilder result = new StringBuilder();
        final StringBuilder word = new StringBuilder();
        /**
         * 判断每个字符，如果不是空格，加入到word中，如果是空格，反转word，然后加入result中
         * 同时将word的大小重置为0
         */
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
    	
    public static void main(String[] args) {
		String string = "Let's take LeetCode contest";
		Question557 question557 = new Question557();
		System.out.println(question557.reverseWords(string));
	}
}
