package questao1;
import java.util.Arrays;
import java.util.List;

import questao1.classifications.Classification;
import questao1.classifications.HighClassification;
import questao1.classifications.LowClassification;
import questao1.classifications.MediumClassification;
import questao1.classifications.NullClassification;
import questao1.classifications.RareCaseClassification;

/*
    1. 
    Refatore o código acima aplicando boas práticas de nomes, clareza 
    e responsabilidade única. Use nomes semânticos, extração de métodos e 
    evite decisões de negócio embutidas em métodos genéricos.

    2. 
    Adicione um novo comportamento que imprima "MÉDIO" quando o valor for 
    exatamente 10, mantendo a clareza do código e testabilidade. Identifique 
    ao menos dois _bad smells_ presentes no código original e indique como a 
    sua refatoração os resolveu.

    3. 
    Implemente um teste automatizado que valide os três comportamentos. 
    Apresente o código do teste e evidencie sua execução com uma screenshot
    ou saída do terminal. 
 */

public class Classificator{
    
    // ⚠️ WARNING
    /// Be aware that the order of the list also defines the priority of each classification in case of conflict
    private final List<Classification> classifications = Arrays.asList(
        new RareCaseClassification(),
        new HighClassification(),
        new MediumClassification(),
        new LowClassification()
    );

    public void ClassifyInt(int integer) {
        
        Classification foundClassification = new NullClassification();

        for (Classification c : classifications) {
            if( c.matchClassification(integer) ){
                foundClassification = c;
                break;
            }
        }
        
        System.out.println( foundClassification.getName() );
    }
}