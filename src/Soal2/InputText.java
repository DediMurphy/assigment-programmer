package Soal2;

/**
 * Kelas InputText digunakan untuk menampung input karakter. Kelas ini menyediakan fungsi untuk
 * menambahkan karakter dan mendapatkan nilai hasil input dalam bentuk string.
 */
public class InputText {
    protected StringBuilder value;

    /**
     * Konstruktor InputText menginisialisasi objek StringBuilder untuk menampung nilai input.
     */
    public InputText() {
        value = new StringBuilder();
    }

    /**
     * Method Add menambahkan karakter ke dalam nilai (value) yang ada.
     *
     * @param c Karakter yang akan ditambahkan ke nilai saat ini.
     */
    public void Add(char c) {
        value.append(c);
    }

    /**
     * Method GetValue mengembalikan nilai yang telah ditambahkan dalam bentuk string.
     *
     * @return String yang merupakan hasil penggabungan semua karakter yang telah diinput.
     */
    public String GetValue() {
        return value.toString();
    }
}



