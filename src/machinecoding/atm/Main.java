package machinecoding.atm;

import machinecoding.atm.entities.AtmMachine;
import machinecoding.atm.enums.Operations;

public class Main {
    public static void main(String[] args) {
        AtmMachine atm = new AtmMachine(1000);

        atm.insertCard();
        atm.enterPin("123");
        atm.selectOperation(Operations.CHECKBALANCE);
        atm.checkBalance();
        atm.selectOperation(Operations.WITHDRAWCASH);
        atm.withdrawCash(1000);
        atm.selectOperation(Operations.EXIT);
    }
}
