package builder;

import builder.GalustyanBuilder.DjamshudBuilder;
import builder.Svetlyakov.Boss;

/**
 * Created by admin on 03.05.2017.
 */
public class ClassMain {
    public static void main(String[] args) {
        DjamshudBuilder djamshudBuilder = new DjamshudBuilder();

        Boss boss = new Boss(djamshudBuilder);
        boss.build();
    }
}
