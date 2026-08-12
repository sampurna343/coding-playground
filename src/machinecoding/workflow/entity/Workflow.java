package machinecoding.workflow.entity;

public class Workflow {
    private Step startStep;

    public void addStartStep(Step startStep) {
        this.startStep = startStep;
    }

    public void start(Object object) {
        this.startStep.process(object);
    }
}
