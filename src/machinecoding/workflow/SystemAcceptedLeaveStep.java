package machinecoding.workflow;

import machinecoding.workflow.entity.Step;

public class SystemAcceptedLeaveStep extends Step {

    @Override
    protected void action(Object object) {
        Leave leave = (Leave) object;
        leave.setStatus(LeaveStatus.PENDING);
        System.out.println("Leave Pending");
    }
}
