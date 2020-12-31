package patternsearch;

/**
 * Pattern Search
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1.search("ABABABCABABABCABABABC" , "ABABAC");
    }

    public static void search( String text, String pattern ) {
        for(int i = 0 ; i <= text.length() - pattern.length(); i++ ) {
            if (text.charAt(i) == pattern.charAt(0)) {
                if( text.substring(i, i + pattern.length()).equals(pattern)) {
                    System.out.println("Pattern found at index" + i);
                }
            }
        }
    }
}
