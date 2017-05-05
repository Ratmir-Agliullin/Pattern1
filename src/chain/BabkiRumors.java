package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class BabkiRumors extends Rumor {
    private boolean isLive=true;

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void obs() {
        if(!isLive) {
            System.out.println("Babka is dead");
            return;
        }
        System.out.println("babka said");
        super.obs();
    }
}
