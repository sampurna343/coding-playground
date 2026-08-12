package machinecoding.workflow;

import machinecoding.workflow.entity.Condition;
import machinecoding.workflow.entity.Transition;
import machinecoding.workflow.entity.Workflow;

public class Main {
    public static void main(String[] args) {


        ApplyLeaveStep applyLeaveStep = new ApplyLeaveStep();
        Condition isCreatedStatus = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.CREATED));

        SystemAcceptedLeaveStep systemAcceptedLeaveStep = new SystemAcceptedLeaveStep();
        Condition isPendingStatus = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.PENDING));

        TakeActionForLeaveStep takeActionForLeaveStep = new TakeActionForLeaveStep();
        Condition isApprovedStatus = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.APPROVED));
        Condition isRejectedStatus = ((leaveObject) -> ((Leave) leaveObject).getStatus().equals(LeaveStatus.REJECTED));

        ApprovedLeaveStep approvedLeaveStep = new ApprovedLeaveStep();
        RejectedLeaveStep rejectedLeaveStep = new RejectedLeaveStep();


        //Transitions
        Transition transitInto_SystemAcceptedLeaveStep = new Transition(isCreatedStatus, systemAcceptedLeaveStep);

        Transition transitInto_TakeActionForLeaveStep = new Transition(isPendingStatus, takeActionForLeaveStep);

        Transition transitInto_ApprovedLeaveStep = new Transition(isApprovedStatus, approvedLeaveStep);
        Transition transitInto_RejectedLeaveStep = new Transition(isRejectedStatus, rejectedLeaveStep);

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
