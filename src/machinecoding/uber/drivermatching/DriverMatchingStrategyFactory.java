package machinecoding.uber.drivermatching;

import machinecoding.uber.enums.DriverMatchingStrategyType;

public class DriverMatchingStrategyFactory {
    public static DriverMatchingStrategy getStrategy(DriverMatchingStrategyType driverMatchingStrategyType) {
        if (driverMatchingStrategyType.equals(DriverMatchingStrategyType.NEAREST_DISTANCE)) {
            return new NearestDistanceDriverMatchingStrategy();
        } else if (driverMatchingStrategyType.equals(DriverMatchingStrategyType.SHORTEST_TIME)) {
            return new ShortestTimeDriverMatchingStrategy();
        }
        else{
            throw new IllegalArgumentException("driver matching type invalid");
        }
    }
}
