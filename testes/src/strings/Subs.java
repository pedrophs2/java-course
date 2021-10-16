package strings;

public class Subs {
	
	public static void main(String[] args) {
		String[] inputs = {"abcabcbb", "bbbbb", "pwwkew", "", "dvdf", "asljlj", "ckilbkd"};
		for(String s: inputs) {
			System.out.println(longestSubstr(s));
		}
		
		//longestSubstr(inputs[inputs.length - 1]);
	}
	
	private static int longestSubstr(String s) {		
		return getStr(s).length();
	}
	
	private static String getStr(String s) {
		String sub = "";
		boolean repeat = false;
		int len = s.length();
		int max = 0;
		
		for(int i = 0; i < len; i++) {
			repeat = sub.contains(String.valueOf(s.charAt(i))) || repeat;
			
			if(repeat && (len - 1) >= i + 1 && s.charAt(i) != s.charAt(i+1) && (len - i) > max)
				return getStr(s.substring(1));
			
			if(!sub.contains(String.valueOf(s.charAt(i))) && !repeat)
				sub += String.valueOf(s.charAt(i));
			
			max = sub.length();
		}
		
		System.out.println(sub);
		return sub;
	}
}
