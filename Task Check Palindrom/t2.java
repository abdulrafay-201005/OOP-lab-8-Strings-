public class t2{
    
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "")
                            .toLowerCase();
        
        
                String reversed = new StringBuilder(cleaned)
                              .reverse()
                              .toString();
        
        return cleaned.equals(reversed);
    }
    
    
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));  
    }
}