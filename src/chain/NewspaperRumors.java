package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class NewspaperRumors extends Rumor {
    public void setBalance(long balance) {
        this.balance = balance;
    }

    private long balance = 0;
    @Override
    public void obs() {
        if(balance>10000) {
            System.out.println("Rumors is not been confirmed");
            return;
        }
        System.out.println("newspaper said");
        super.obs();
    }
}
