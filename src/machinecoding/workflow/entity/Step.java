package machinecoding.workflow.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Step {

    private List<Transition> transitions;

    public Step() {
        this.transitions = new ArrayList<>();
    }

    public void addTransition(Transition transition) {
        this.transitions.add(transition);
    }

    public void process(Object object) {
        action(object);
        checkForNextSteps(object);
    }

    protected abstract void action(Object object);

    final void checkForNextSteps(Object object) {
        if (transitions == null || transitions.isEmpty()) {
            return;
        }

        for (Transition transition : transitions) {
            transition.evaluate(object);
        }
    }
}
