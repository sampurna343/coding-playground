package machinecoding.workflow;

import machinecoding.workflow.entity.Step;

import java.util.concurrent.ThreadLocalRandom;

public class TakeActionForLeaveStep extends Step {

    @Override
    protected void action(Object object) {
        Leave leave = (Leave) object;

        if (ThreadLocalRandom.current().nextBoolean()) {
            leave.setStatus(LeaveStatus.APPROVED);
            System.out.println("Leave Approved");
        } else {
            leave.setStatus(LeaveStatus.REJECTED);
            System.out.println("Leave Rejected");
        }
    }
}
