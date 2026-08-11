package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;

public class WithdrawCashState extends AtmState {

    public WithdrawCashState() {
        System.out.println("Enter amount to withdraw cash");
    }

    @Override
    public void withdrawCash(AtmMachine atmMachine, int amount) {
        if (amount <= atmMachine.getAtmFund()) {
            //check own balance
            atmMachine.setAtmFund(atmMachine.getAtmFund() - amount);
            System.out.println("cash withdrawn..." + amount);
        }
        else{
            System.out.println("no cash in atm" + amount);
        }
        atmMachine.setAtmState(new SelectOperationState());
    }
}
