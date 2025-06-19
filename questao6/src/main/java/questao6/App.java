package questao6;

import questao6.documentTypes.HTMLDocument;
import questao6.documentTypes.MDDocument;
import questao6.documentTypes.PDFDocument;
public class App {
    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++++++++++++++++++\n");

        Document pdf = new PDFDocument();
        pdf.print();

        Document html = new HTMLDocument();
        html.print();

        // Nova subclasse, criada para cumprir o requisito: 'instancie três documentos diferentes'
        Document md = new MDDocument();
        md.print();
        
        
        System.out.println("\n+++++++++++++++++++++++++++++++++++++");
    }
}

