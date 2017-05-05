package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class PostgreDb implements DB {
    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("fr1", "fr2", "fr3");
    }

    @Override
    public int getMoney() {
        return 10;
    }

    @Override
    public List<String> getListOfWall() {
        return Arrays.asList("w1", "w2","w3");
    }
}
