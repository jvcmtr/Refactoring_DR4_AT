package questao5;


public class App {
    public static void main(String[] args) {

        var service = new NotificationService();
        service.notifyUser("EMAIL", "Olá usuario");
    }
}