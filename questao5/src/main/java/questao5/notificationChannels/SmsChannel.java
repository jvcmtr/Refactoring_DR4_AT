package questao5.notificationChannels;

public class SmsChannel extends BaseChannel {

    private final String NAME = "SMS".toUpperCase();

    @Override
    public String getChannelName() {
        return NAME;
    }

}
