package machinecoding.workflow.entity;

public class Transition {
    private Condition condition;
    private Step step;

    public Transition(Condition condition, Step step) {
        this.condition = condition;
        this.step = step;
    }


    public void evaluate(Object object) {
        if (condition.matches(object)) {
            step.process(object);
        }
    }

}
