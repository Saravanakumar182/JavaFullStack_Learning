package test;

import main.Document;
import main.DocumentFactory;

public class DocumentFactoryTest {
    public static void main(String[] args) {
        DocumentFactory documentFactory  =new DocumentFactory();

        Document pdf = documentFactory.createDocument("pdf");
        pdf.read();
        Document word = documentFactory.createDocument("word");
        word.read();
        Document excel = documentFactory.createDocument("excel");
        excel.read();

        Document text = documentFactory.createDocument(" ");
        text.read();
    }
}
