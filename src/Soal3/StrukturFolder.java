package Soal3;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas StrukturFolder berfungsi untuk mencari nama folder berdasarkan awalan yang diberikan
 * dalam struktur XML yang menggambarkan folder-folder tersebut.
 */
public class StrukturFolder {

    /**
     * Fungsi utama untuk mencari folder berdasarkan awalan string yang diberikan.
     *
     * @param xml   String yang berisi struktur XML dari folder.
     * @param awalan String awalan yang akan digunakan untuk mencari nama folder yang sesuai.
     * @return List<String> yang berisi nama folder yang dimulai dengan awalan tersebut.
     */
    public static List<String> CariAwalan(String xml, String awalan) {
        List<String>  result = new ArrayList<>();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new ByteArrayInputStream(xml.getBytes()));
            Element root = document.getDocumentElement();
            CariFolder(root, awalan, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Fungsi rekursif untuk mencari folder yang memiliki awalan tertentu dalam nama mereka.
     * Fungsi ini akan mengecek setiap elemen folder dalam XML dan menambahkannya ke dalam hasil
     * jika nama folder dimulai dengan awalan yang diberikan.
     *
     * @param element Elemen XML yang sedang diproses.
     * @param awalan  String awalan yang digunakan untuk mencocokkan nama folder.
     * @param result  List yang menampung nama folder yang cocok dengan awalan.
     */
    private static void CariFolder(Element element, String awalan, List<String> result) {
        if (element.hasAttribute("name")) {
            String foldername = element.getAttribute("name");
            if (foldername.startsWith(awalan)) {
                result.add(foldername);
            }
        }

        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++){
            Node node = childNodes.item(i);
            if (node instanceof Element && node.getNodeName().equals("folder")) {
                CariFolder((Element) node, awalan, result);
            }
        }
    }
}
