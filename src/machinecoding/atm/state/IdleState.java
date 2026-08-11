package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;

public class IdleState extends AtmState{

    public IdleState() {
        System.out.println("Insert your card");
    }

    @Override
    public void insertCard(AtmMachine atmMachine){
        System.out.println("card accepted...");
        atmMachine.setAtmState(new EnterPinState());
    }
}
