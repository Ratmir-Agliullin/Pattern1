package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        BabkiRumors babkiRumors =  new BabkiRumors();
        babkiRumors.setLive(false);
        babkiRumors.setMessage("Strings are very popular in Innopolis");
        NewspaperRumors newspaperRumors = new NewspaperRumors();
        InternetRumors internetRumors =  new InternetRumors();
        internetRumors.setConnect(false);
        newspaperRumors.setBalance(11000L);
        babkiRumors.setRumor(newspaperRumors);
        newspaperRumors.setRumor(internetRumors);
        babkiRumors.obs();
    }
}
