import Soal2.InputNumeric;
import Soal2.InputText;
import Soal3.StrukturFolder;
import java.util.List;
import static Soal1.PalindromeChecker.CekSama;

public class Main {
    public static void main(String[] args) {
        // Soal 1
        System.out.println("Soal 1 - Palindrome Check:");
        System.out.println(CekSama("katak"));
        System.out.println(CekSama("KATak"));
        System.out.println(CekSama("rumah"));
        System.out.println("\n-----\n");
        // end soal 1

        // Soal 2
        System.out.println("Soal 2 - Input Numeric:");
        InputText input = new InputNumeric();

        input.Add('2');
        input.Add('a');
        input.Add('5');

        System.out.println(input.GetValue());
        System.out.println("\n-----\n");
        // end soal 2

        // soal 3
        System.out.println("Soal 3 - Folder Search:");
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        List<String> names = StrukturFolder.CariAwalan(xml, "u");

        for (String name : names) {
            System.out.println(name);
        }
        // end soal 3
    }
}


