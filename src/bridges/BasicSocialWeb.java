package bridges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb {

private DB postgreDB = new PostgreDb();
    private List<String> friends = new ArrayList<>();
    {
        friends.add("eddw");
        friends.add("cwscds");
    }

   private int money;

    private List<String> wall = new ArrayList<>();
    {
        wall.add("entry1");
        wall.add("entry2");
    }

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends();
    }

    @Override
    public void pay(int value) {
money = postgreDB.getMoney();
    }

    @Override
    public List<String> wall() {
        return postgreDB.getListOfWall();
    }
}
