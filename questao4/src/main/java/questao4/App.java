package questao4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var addresses = Arrays.asList(
            new Address("Rua dos bobos", "0", "123-45-67" )
        );

        var user = new User("joao", "joao.ramos@al.infnet.edu.br", addresses );
        printDetails(user);
    }

    public static void printDetails(User user){

        System.out.println("NOME : " + user.getName());
        System.out.println("EMAIL : " + user.getEmail());
        System.out.println("ADDRESSES : ");
        for (Address add : user.getAddresses()) {
            System.out.println("\t - " + add.toString());
        }
    }
}