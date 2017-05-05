package State;

/**
 * Created by admin on 05.05.2017.
 */
public class StateNewDoc implements CurrentState {
    @Override
    public void doAction(Context context) {
        System.out.println("Новый документ. Состояние 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.setCurrentState(this);
    }

    @Override
    public void doNext(Context context, CurrentState nextState) {
        System.out.println("Переходим в состояние 3. Подписание");
        context.setNextState(nextState);

    }
}
