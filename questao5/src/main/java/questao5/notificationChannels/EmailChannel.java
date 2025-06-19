
package questao5.notificationChannels;

public class EmailChannel extends BaseChannel {

    private final String NAME = "EMAIL".toUpperCase();

    @Override
    public String getChannelName() {
        return NAME;
    }

}
