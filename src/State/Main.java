package State;

/**
 * Created by admin on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        SentOneToEDO sentOneToEDO = new SentOneToEDO();
        CurrentState nextState = new StateNewDoc();
        sentOneToEDO.doAction(context);
        sentOneToEDO.doNext(context,nextState);

        StateNewDoc stateNewDoc1 = new StateNewDoc();
        stateNewDoc1.doAction(context);
        nextState = new SignedDoc();
        stateNewDoc1.doNext(context,nextState);

        SignedDoc signedDoc = new SignedDoc();
        signedDoc.doAction(context);
        signedDoc.setSigned(false);
        nextState = new SignError();
        signedDoc.doNext(context,nextState);

        SignError signError = new SignError();
        signError.doAction(context);


    }
}
