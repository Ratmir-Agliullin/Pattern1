package State;

/**
 * Created by admin on 05.05.2017.
 */
public class SentOneToEDO implements CurrentState {// первое состояние.

    @Override
    public void doAction(Context context) {
        System.out.println("Документ отсылается. Состояние 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.setCurrentState(this);
    }

    @Override
    public void doNext(Context context,CurrentState nextState) {
        System.out.println("Переходим в состояние 2. Новый документ");

     context.setNextState(nextState);
    }
}
