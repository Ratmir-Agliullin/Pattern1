package builder.GalustyanBuilder;

import builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class RafshanBuilder implements HouseBuilder {
    private String basement;
    private String walls;
    private String roof;
    @Override
    public void fillBasement() {
        basement = "фундамент";

    }

    @Override
    public void createWalls() {
        walls = "стена";
    }

    @Override
    public void createRoof() {
        roof = "крыша";
    }

    public String getResult(){
        return basement+" "+walls+"  "+roof;
    }
}
