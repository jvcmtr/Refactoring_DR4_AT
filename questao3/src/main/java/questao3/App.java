package questao3;

/*

    Reescreva esse método com foco em **clareza**, 
    **uso de variáveis explicativas** e **métodos auxiliares**,
    quando apropriado.

 */

public class App {
    public static void main(String[] args) {

        System.out.println(calculatePrice(12.0, 0, false));
    }

    public static double calculatePrice(double basePrice, int customerType, boolean holiday) {
        double discount = 0;
        if (customerType == 1) discount = 0.1;
        else if (customerType == 2) discount = 0.15;
        if (holiday) discount += 0.05;
        return basePrice * (1 - discount);
    }
}
