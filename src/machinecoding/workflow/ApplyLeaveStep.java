package machinecoding.workflow;

import machinecoding.workflow.entity.Step;

public class ApplyLeaveStep extends Step {

    @Override
    protected void action(Object object) {
        Leave leave = (Leave) object;
        leave.setStatus(LeaveStatus.CREATED);
        System.out.println("Leave Created");
    }
}
