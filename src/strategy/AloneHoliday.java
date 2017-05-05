package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class AloneHoliday implements HolydayStrategy {
    @Override
    public void celebrate() {
        System.out.println("alone");
    }
}
