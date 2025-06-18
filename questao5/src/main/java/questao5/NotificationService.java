package questao5;

/*

    Refatore esse código aplicando **polimorfismo**
    para evitar a estrutura condicional. Use uma 
    hierarquia de classes ou interfaces.

*/

public class NotificationService {
    public void notifyUser(String channel, String message) {
        if (channel.equals("EMAIL")) {
            System.out.println("Sending EMAIL: " + message);
        } else if (channel.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (channel.equals("PUSH")) {
            System.out.println("Sending PUSH: " + message);
        }
    }
}
