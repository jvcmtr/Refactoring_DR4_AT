package questao1;

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

public class Classificator {
    public void ClassifyInt(int integer) {
        if (integer > 10) {
            System.out.println("ALTO");
        } else if (integer == -9999) {
            System.out.println("CASO RARO");
        } else {
            System.out.println("BAIXO");
        }

        System.out.println("DEBUG: z = " + integer);

    }
}