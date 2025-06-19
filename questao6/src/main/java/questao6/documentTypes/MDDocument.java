package questao6.documentTypes;

import questao6.Document; 

public class MDDocument implements Document {

    @Override
    public void print() {
        System.out.println("Printing MarkDown");
    }
    
}
