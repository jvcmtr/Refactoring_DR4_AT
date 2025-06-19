package questao5;

import java.util.Arrays;
import java.util.List;

import questao5.notificationChannels.EmailChannel;
import questao5.notificationChannels.INotificationChannel;
import questao5.notificationChannels.PushChannel;
import questao5.notificationChannels.SmsChannel;

/*

    Refatore esse código aplicando **polimorfismo**
    para evitar a estrutura condicional. Use uma 
    hierarquia de classes ou interfaces.

*/

public class NotificationService {

    private List<INotificationChannel> availableChannels = Arrays.asList(
        new EmailChannel(),
        new SmsChannel(),
        new PushChannel()
    );

    public void notifyUser(String channel, String message) {
        
        for (INotificationChannel c : availableChannels) {
            if(c.getChannelName().equals(channel)){
                c.sendMessage(message);
                return;
            }  
        }

        throw new IllegalArgumentException("The channel with the provided name is not available");
    }
}


