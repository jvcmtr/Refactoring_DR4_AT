package questao2;
/*
    1. 
    Liste os "bad smells" presentes nesse código, associando 
    cada um a um tipo específico do catálogo de code smells. 
    Mostre o máximo que encontrar. 

    2. 
    Escolha **um** desses problemas e descreva uma refatoracão
    que poderia eliminá-lo. Use código para ilustrar.
*/

/*
    (pt-br) Infelizmente o enunciado da questão orienta a corrigir somente **um** "bas smell", sendo assim, o escolhido foi "codigo duplicado"
    (eng) Unfortunately, the question prompt instructs to fix only **one** "bad smell", therefore, the one chosen was "duplicated code."
 */

public class Invoice {
    public String clientName;
    public String clientEmail;
    public double amount;
    public int type;

    public void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {
        if (clientEmail == null && !clientEmail.contains("@")) {
            System.out.println("Email inválido. Falha no envio.");
        }

        String invoiceString = "--- NOTA FISCAL ---\n" +
            "Cliente: " + clientName + "\n" +
            "Valor: R$ " + amount + "\n" +
            "Tipo: " + (
                type == 1 ? "Simples" 
                : type == 2 ? "Com imposto" 
                : "Desconhecido"
            ) + "\n" 
            + "---------------------";

        //imprimir nota
        System.out.println( invoiceString );
        
        // Enviar nota para email
        System.out.println("Enviando nota fiscal para: " + clientEmail);
        enviarPorEmail(clientEmail, invoiceString);
    }
}

