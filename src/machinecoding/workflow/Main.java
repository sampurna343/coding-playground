package machinecoding.workflow;

import machinecoding.workflow.entity.Condition;
import machinecoding.workflow.entity.Transition;
import machinecoding.workflow.entity.Workflow;

public class Main {
    public static void main(String[] args) {

        ApplyLeaveStep applyLeaveStep = new ApplyLeaveStep();
        SystemAcceptedLeaveStep systemAcceptedLeaveStep = new SystemAcceptedLeaveStep();
        TakeActionForLeaveStep takeActionForLeaveStep = new TakeActionForLeaveStep();
        ApprovedLeaveStep approvedLeaveStep = new ApprovedLeaveStep();
        RejectedLeaveStep rejectedLeaveStep = new RejectedLeaveStep();

        Condition CreatedCondition = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.CREATED));
        Condition PendingCondition = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.PENDING));
        Condition ApprovedCondition = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.APPROVED));
        Condition RejectedCondition = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.REJECTED));

        //Transitions
        Transition transitInto_SystemAcceptedLeaveStep = new Transition(CreatedCondition, systemAcceptedLeaveStep);
        Transition transitInto_TakeActionForLeaveStep = new Transition(PendingCondition, takeActionForLeaveStep);
        Transition transitInto_ApprovedLeaveStep = new Transition(ApprovedCondition, approvedLeaveStep);
        Transition transitInto_RejectedLeaveStep = new Transition(RejectedCondition, rejectedLeaveStep);

        //Adding Transitions
        applyLeaveStep.addTransition(transitInto_SystemAcceptedLeaveStep);
        systemAcceptedLeaveStep.addTransition(transitInto_TakeActionForLeaveStep);
        takeActionForLeaveStep.addTransition(transitInto_ApprovedLeaveStep);
        takeActionForLeaveStep.addTransition(transitInto_RejectedLeaveStep);

        Workflow workflow = new Workflow();
        Leave leave = new Leave();
        workflow.addStartStep(applyLeaveStep);
        workflow.start(leave);
    }
}
