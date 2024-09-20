package Soal2;

/**
 * Kelas InputNumeric adalah subclass dari InputText yang hanya menerima input karakter
 * numerik (digit). Kelas ini meng-override fungsi Add dari kelas induknya,
 * sehingga hanya menambahkan karakter yang merupakan digit.
 */
public class InputNumeric extends InputText {

    /**
     * Override method Add untuk menambahkan karakter ke dalam string value jika karakter
     * tersebut adalah digit.
     *
     * @param c Karakter yang akan ditambahkan, hanya akan ditambahkan jika merupakan digit.
     */
    @Override
    public void Add(char c) {
        if (Character.isDigit(c)) {
            value.append(c);
        }
    }
}
