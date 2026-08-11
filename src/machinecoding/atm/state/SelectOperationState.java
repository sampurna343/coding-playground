package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;
import machinecoding.atm.enums.Operations;

public class SelectOperationState extends AtmState {

    public SelectOperationState() {
        System.out.println("SELECT OPERATION: ");
    }

    @Override
    public void selectOperation(AtmMachine atmMachine, Operations operation) {
        switch (operation) {
            case CHECKBALANCE -> atmMachine.setAtmState(new CheckBalanceState());
            case EXIT -> atmMachine.setAtmState(new ExitState());
            case WITHDRAWCASH -> atmMachine.setAtmState(new WithdrawCashState());
        };
    }
}
