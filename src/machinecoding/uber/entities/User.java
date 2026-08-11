package machinecoding.uber.entities;

import machinecoding.uber.enums.DriverMatchingStrategyType;

public class User {
    private String name;
    private String phnNo;
    private DriverMatchingStrategyType driverMatchingStrategyType;

    public User(String name, String phnNo, DriverMatchingStrategyType driverMatchingStrategyType) {
        this.name = name;
        this.phnNo = phnNo;
        this.driverMatchingStrategyType = driverMatchingStrategyType;
    }

    public String getName() {
        return name;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public DriverMatchingStrategyType getDriverMatchingStrategyType() {
        return driverMatchingStrategyType;
    }

    public void setDriverMatchingStrategyType(DriverMatchingStrategyType driverMatchingStrategyType) {
        this.driverMatchingStrategyType = driverMatchingStrategyType;
    }
}
