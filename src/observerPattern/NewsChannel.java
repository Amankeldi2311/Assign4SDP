package observerPattern;

public class NewsChannel implements IObserver {
    private String channelHeadline;

    @Override
    public void update(String headline) {
        this.channelHeadline = headline;
        display();
    }

    public void display() {
        System.out.println("Channel Name: " + channelHeadline);
    }

}
