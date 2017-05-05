package State;

/**
 * Created by admin on 05.05.2017.
 */
public class SignError implements CurrentState {
    @Override
    public void doAction(Context context) {
        System.out.println("Ошибка подписания. Состояние 4");
        context.setCurrentState(this);
    }

    @Override
    public void doNext(Context context, CurrentState nextState) {
        System.out.println("Переходим в состояние 5. Ошибка документа");

        context.setNextState(nextState);
    }
}
