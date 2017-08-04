package aug2017;
/**
 * Reverse String
 * Given s = "hello", return "olleh".
 * @author ZGJ
 * @date 2017年8月4日 下午1:56:41
 */
public class Question344 {
	
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public String reverseString1(String s){
        if(s == null || s.length() == 0)
            return "";
        char[] cs = s.toCharArray();
        int begin = 0, end = s.length() - 1;
        while(begin <= end){
            char c = cs[begin];
            cs[begin] = cs[end];
            cs[end] = c;
            begin++;
            end--;
        }
        return new String(cs);
    }
}
