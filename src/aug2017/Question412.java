package aug2017;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * 给定一个自然数，输出1到这个自然数的序列，遇到3的倍数输出Fizz,5的倍数输出Buzz，3和5的倍数输出FizzBuzz
 * @author ZGJ
 * @date 2017年8月4日 下午2:00:50
 */
public class Question412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <=n; i++) {
        	if(i % 3 == 0 && i % 15 != 0) {
        		list.add("Fizz");
        	} else if(i % 5 == 0 && i % 15 != 0) {
        		list.add("Buzz");
        	} else if(i % 15 == 0) {
        		list.add("FizzBuzz");
        	} else {
        		list.add(String.valueOf(i));
        	}
        }
        return list;
    }
}
