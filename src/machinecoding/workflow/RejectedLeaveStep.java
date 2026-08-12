package machinecoding.workflow;

import machinecoding.workflow.entity.Step;

public class RejectedLeaveStep extends Step {

    @Override
    protected void action(Object object) {
        Leave leave = (Leave) object;
        System.out.println("Leave Rejected: " + leave.getStatus());
    }
}
