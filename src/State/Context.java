package State;

/**
 * Created by admin on 05.05.2017.
 */
public class Context {
    private CurrentState currentState;

    public CurrentState getNextState() {
        return nextState;
    }

    public void setNextState(CurrentState nextState) {
        this.nextState = nextState;
        System.out.println(nextState.getClass().getName());
    }

    private CurrentState nextState;
    public Context(){
        currentState = null;
    }

    public CurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CurrentState currentState) {
        this.currentState = currentState;
    }


}
