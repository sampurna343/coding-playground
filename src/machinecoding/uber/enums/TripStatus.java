package machinecoding.uber.enums;

public enum TripStatus {
    REQUESTED,          // Rider requested a trip
    SEARCHING_DRIVER,   // Matching with nearby drivers
    DRIVER_ASSIGNED,    // Driver accepted
    DRIVER_ARRIVING,    // Driver is en route to pickup
    DRIVER_ARRIVED,     // Driver reached pickup location
    RIDER_ONBOARDED,    // Trip started
    IN_PROGRESS,        // Trip in progress
    COMPLETED,          // Trip completed successfully
    CANCELLED_BY_RIDER,
    CANCELLED_BY_DRIVER,
    EXPIRED             // No driver found within timeout
}
