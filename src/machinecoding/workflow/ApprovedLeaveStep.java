package machinecoding.workflow;

import machinecoding.workflow.entity.Step;

public class ApprovedLeaveStep extends Step {

    @Override
    protected void action(Object object) {
        Leave leave = (Leave) object;
        System.out.println("Leave Approved: " + leave.getStatus());
    }
}
