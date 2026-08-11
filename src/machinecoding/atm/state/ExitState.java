package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;

public class ExitState extends AtmState {
    @Override
    public void cancel(AtmMachine atmMachine){
        System.out.println("please take your card back and reenter if you need any other operation");
        atmMachine.setAtmState(new IdleState());
    }
}
