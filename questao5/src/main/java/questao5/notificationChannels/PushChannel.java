
package questao5.notificationChannels;
public class PushChannel extends BaseChannel {

    private final String NAME = "PUSH".toUpperCase();

    @Override
    public String getChannelName() {
        return NAME;
    }

}