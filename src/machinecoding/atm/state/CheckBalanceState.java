package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;

public class CheckBalanceState extends AtmState {

    public CheckBalanceState() {
        System.out.println("You can check the balance");
    }

    @Override
    public void checkBalance(AtmMachine atmMachine){
        System.out.println("balance checked...");
        atmMachine.setAtmState(new SelectOperationState());
    }
}
