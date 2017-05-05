package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class Context {
   private HolydayStrategy holydayStrategy;
   private boolean hasFamily;
   private boolean hasFriends;
   private int cash;
   public void celebrate(){
       if(hasFamily){
           holydayStrategy = new FamilyHolyday();
       } else if(hasFriends && cash>5000){
           holydayStrategy = new FriendsHoliday();
       } else holydayStrategy = new AloneHoliday();
   }

    public void setHasFamily(boolean hasFamily) {
        this.hasFamily = hasFamily;
    }

    public void setHasFriends(boolean hasFriends) {
        this.hasFriends = hasFriends;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
