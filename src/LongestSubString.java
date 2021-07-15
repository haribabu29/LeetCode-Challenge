import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int oldLengthOfLongestSubstring(String s){
        if(s.length() < 2) return s.length();
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int ans = 0;
        while(start < s.length()){
            if(set.contains(s.charAt(start))){
                set.remove(s.charAt(end)); 
                end++;
            }else {
                set.add(s.charAt(start)); 
                ans = Math.max(ans,  start - end + 1);
                start++; 
            }
        }
        return ans;
    }
    public int lengthOfLongestSubstring(String s){
        return 0;
    }
    public static void main(String[] args) {
        LongestSubString lss = new LongestSubString();
        System.out.println(lss.lengthOfLongestSubstring("abcabc"));
    }
}