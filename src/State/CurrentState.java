package State;

/**
 * Created by admin on 05.05.2017.
 */
public interface CurrentState {
    void doAction(Context context);
    void doNext(Context context,CurrentState nextState);
 CurrentState nextState = null;

}
