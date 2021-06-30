import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s){
        if(s.length() < 2) return s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int ans = 0;
        while(i < s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j)); 
                j++;
            }else {
                set.add(s.charAt(i)); 
                ans = Math.max(ans,  i - j + 1);
                i++; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubString lss = new LongestSubString();
        System.out.println(lss.lengthOfLongestSubstring("abcabc"));
    }
}
