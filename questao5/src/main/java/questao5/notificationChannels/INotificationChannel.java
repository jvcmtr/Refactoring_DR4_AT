package questao5.notificationChannels;

public interface INotificationChannel {
    
    public String getChannelName();
    public void sendMessage(String message);
}
