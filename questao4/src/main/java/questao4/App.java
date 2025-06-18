package questao4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        var user = new User("joao", "joao.ramos@al.infnet.edu.br", Arrays.asList("endereço 1", "endereço 2") );
        
        System.out.println("NOME : " + user.getName());
        System.out.println("EMAIL : " + user.getEmail());
        System.out.println("ADDRESSES : ");
        for (Object add : user.getAddresses()) {
            System.out.println("\t - " + add.toString());
        }
    }
}