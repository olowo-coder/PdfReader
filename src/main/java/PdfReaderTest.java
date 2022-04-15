import java.io.File;
import java.io.IOException;
import java.io.InputStream;
// Importing Apache POI classes
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfReaderTest {
    public static void main(String[] args) throws IOException {
        String filepath = "/Users/mac/IdeaProjects/untitled/src/main/java/Cover-letter-Bending-Spoon-Olowofela.pdf";
        String filepath2 = "/Users/mac/IdeaProjects/untitled/src/main/java/Dropbox-IGNITE-Engineering-Apprenticeship.pdf";
        String filepath3 = "/Users/mac/IdeaProjects/untitled/src/main/java/cv-sample.pdf";
        InputStream resourceStream = PdfReaderTest.class.getResourceAsStream(filepath);
        try {
            PdfReader pdfReader = new PdfReader(filepath2);
            int pages = pdfReader.getNumberOfPages();
            for(int i=1; i<=pages; i++) {
                String pageContent =
                        PdfTextExtractor.getTextFromPage(pdfReader, i);
                System.out.println("Content on Page "
                        + i + ": " + pageContent);
            }
            pdfReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
