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

        if (type == 1) {
            System.out.println("Nota fiscal simples");
        } else if (type == 2) {
            System.out.println("Nota fiscal com imposto");
        } else if (type == -1) {
            // caso nunca ocorre, mas está presente
            System.out.println("Nota fiscal fantasma");
        } else {
            System.out.println("Tipo desconhecido");
        }
        //imprimir nota
        System.out.println("--- NOTA FISCAL ---");
        System.out.println("Cliente: " + clientName);
        System.out.println("Valor: R$ " + amount);

        if (type == 1) {
            System.out.println("Tipo: Simples");
        } else if (type == 2) {
            System.out.println("Tipo: Com imposto");
        } else {
            System.out.println("Tipo: Desconhecido");
        }
        System.out.println("---------------------");
        // Enviar nota para email
        System.out.println("Enviando nota fiscal para: " + clientEmail);
        String nota = "--- NOTA FISCAL ---\n" +
              "Cliente: " + clientName + "\n" +
              "Valor: R$ " + amount + "\n" +
              "Tipo: " + (type == 1 ? "Simples" : type == 2 ? "Com imposto" : "Desconhecido") + "\n" +
              "---------------------";
        enviarPorEmail(clientEmail, nota);
    }
}

