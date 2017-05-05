package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class OracleDB implements DB {
    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("orfr1", "orfr2", "orfr3");
    }

    @Override
    public int getMoney() {
        return 20;
    }

    @Override
    public List<String> getListOfWall() {
        return Arrays.asList("orw1", "orw2","orw3");
    }
}
