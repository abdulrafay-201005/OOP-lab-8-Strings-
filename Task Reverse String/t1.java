public class t1 {

    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);
        System.out.println("Reversed String: " + output);
    }
}