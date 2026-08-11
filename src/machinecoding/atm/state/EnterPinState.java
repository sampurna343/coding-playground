package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;

public class EnterPinState extends AtmState {

    public EnterPinState() {
        System.out.println("Enter your pin");
    }

    @Override
    public void enterPin(AtmMachine atmMachine, String pin){
        System.out.println("Pin Validated Successfully");
        atmMachine.setAtmState(new SelectOperationState());
    }
}
