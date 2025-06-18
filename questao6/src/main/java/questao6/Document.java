package questao6;

/*
    1. 
    Identifique os problemas causados pela abordagem
    atual baseada em códigos de tipo.
        
    2. 
    Implemente a refatoração completa substituindo o 
    campo type por uma hierarquia com subclasses 
    PdfDocument, HtmlDocument, etc., aplicando polimorfismo.
        
    3. 
    Implemente uma classe principal com um método main 
    que instancie três documentos diferentes utilizando 
    as novas subclasses (PdfDocument, HtmlDocument, etc.)
    e invoque o método print() para cada um. O código deve
    demonstrar o uso correto do polimorfismo.

    Mostre o resultado esperado da execução e explique 
    por que essa abordagem melhora a coesão, reduz 
    duplicação e facilita a adição de novos formatos de 
    documento.
*/

public class Document {
    public String type;

    public void print() {
        if (type.equals("PDF")) {
            System.out.println("Printing PDF");
        } else if (type.equals("HTML")) {
            System.out.println("Printing HTML");
        } else {
            System.out.println("Unknown format");
        }
    }
}
