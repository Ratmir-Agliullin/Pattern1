package State;

/**
 * Created by admin on 05.05.2017.
 */
public class SignedDoc implements CurrentState {
    private boolean signed=true;

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Состояние подписан. Состояние 3");
        context.setCurrentState(this);

    }

    @Override
    public void doNext(Context context, CurrentState nextState) {
        if(signed) {
            System.out.println("Переходим в состояние 4.");

            context.setNextState(nextState);
        } else System.out.println("подпишите документ сначала");
    }
}
