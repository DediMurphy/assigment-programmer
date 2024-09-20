package Soal1;

/**
 * Kelas PalindromeChecker digunakan untuk memeriksa apakah suatu string adalah palindrome,
 * yaitu string yang dapat dibaca sama dari depan maupun belakang.
 */
public class PalindromeChecker {

    /**
     * Memeriksa apakah string yang diberikan adalah palindrome.
     *
     * @param str String yang akan diperiksa.
     * @return boolean true jika string adalah palindrome, false jika tidak.
     */
    public static boolean CekSama(String str) {
        String lowercaseStr = str.toLowerCase();
        return lowercaseStr.contentEquals(new StringBuilder(lowercaseStr).reverse());
    }
}
