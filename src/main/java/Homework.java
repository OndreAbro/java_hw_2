
public class Homework {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abda")); // false
        System.out.println(isPalindrome("ababa")); // true
        System.out.println(isPalindrome("qwertyytrewq")); // true
        System.out.println(isPalindrome("uiop98:_._.:89poiu")); // false
        System.out.println(isPalindrome("uiop98:___:89poiu")); // true
        System.out.println(isPalindrome("qwertytrewq")); // true
        System.out.println(isPalindrome("eifgelfdgd")); // false
        System.out.println(isPalindrome(" ")); // true
        System.out.println(isPalindrome(" --- ")); // true
        System.out.println(isPalindrome("abc")); // true
        System.out.println(isPalindrome("a")); // true

    }
    /**
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    static boolean isPalindrome(String source) {
        for (int i = 0; i < source.length() / 2; i++) {
            if (source.charAt(i) != source.charAt(source.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
