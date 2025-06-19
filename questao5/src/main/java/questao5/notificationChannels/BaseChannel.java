package questao5.notificationChannels;

public abstract class BaseChannel implements INotificationChannel {

    @Override
    public abstract String getChannelName();

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + getChannelName() + ": " + message);
    }


}
