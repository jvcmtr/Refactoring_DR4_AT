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
        double discount = getDiscount(customerType, holiday);
        return applyDiscount(basePrice, discount);
    }

    public static double applyDiscount(double basePrice, double discount) {
        return basePrice * (1 - discount);
    }

    public static double getDiscount(int customerType, boolean holiday) {
        double discount = 0;

        discount += getCustomerDiscount(customerType);
        discount += getHolidayDiscount(holiday);
        
        return discount;
    }
    
    public static double getCustomerDiscount(int customerType){
        return switch (customerType) {
            case 1 -> 0.1;
            case 2 -> 0.15;
            default -> 0;
        };
    }

    public static double getHolidayDiscount(boolean isHoliday){
        return isHoliday? 0.05 : 0;
    }
}
