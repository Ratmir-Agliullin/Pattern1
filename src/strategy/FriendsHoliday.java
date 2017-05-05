package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class FriendsHoliday implements HolydayStrategy {
    @Override
    public void celebrate() {
        System.out.println("with friends");
    }
}
