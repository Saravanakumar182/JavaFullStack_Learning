package main;

public class DocumentFactory {
    public Document createDocument(String doc){
        if(doc.equalsIgnoreCase("pdf")){
            return new PdfDocument();
        }else if(doc.equalsIgnoreCase("word")){
            return new WordDocument();
        }else if(doc.equalsIgnoreCase("excel")){
            return new ExcelDocument();
        }    
            return new TextDocument();
    }
}
