package chain;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class Rumor {
    private Rumor rumor;

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public void setRumor(Rumor rumor) {
        this.rumor = rumor;
    }
    public void obs(){

        if(rumor!=null){
            rumor.message = message;
            System.out.println(message);

            rumor.obs();
        }}



}
