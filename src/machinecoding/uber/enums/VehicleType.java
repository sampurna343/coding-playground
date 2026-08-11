package machinecoding.uber.enums;

public enum VehicleType {
    MOTO(1.0),
    ECONOMY(1.2),
    PREMIUM(1.5),
    AUTO(1.2),
    INTERCITY(1.4);

    final double priceMultiplier;
    VehicleType(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier(){
        return priceMultiplier;
    }
}
