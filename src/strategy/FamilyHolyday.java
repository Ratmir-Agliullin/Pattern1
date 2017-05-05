package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class FamilyHolyday implements HolydayStrategy {
    @Override
    public void celebrate() {
        System.out.println("With family");
    }
}
