public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("мама"));
        System.out.println(isPalindrome("КАБАН"));
        System.out.println(isPalindrome("КАБАК"));
        System.out.println(isPalindrome("поТоп"));

    }

    public static boolean isPalindrome(String text) {
        String string = text.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        boolean answer = true;
        for (int count = 0; count < string.length(); count++) {
            if (string.charAt(count) != stringBuilder.charAt(count)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
