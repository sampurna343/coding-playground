package machinecoding.parkinglot.service;

import machinecoding.parkinglot.entity.ParkingLot;
import machinecoding.parkinglot.entity.Spot;
import machinecoding.parkinglot.enums.VehicleSpotType;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class ParkingLotService {
    private ParkingLot parkingLot;
    private Map<VehicleSpotType, BlockingQueue<Spot>> availSpotMap;

    public Spot assignSpot(VehicleSpotType vehicleSpotType) {
        Queue<Spot> availableSpots = availSpotMap.get(vehicleSpotType);
        Spot spot = availableSpots.poll();
        if (spot != null) {
            spot.occupy();
        }
        return spot;
    }

    public void releaseSpot(Spot spot) {
        spot.release();
        Queue<Spot> availableSpots = availSpotMap.get(spot.getVehicleSpotType());
        availableSpots.add(spot);
    }

    private boolean checkAvailability() {
        return true;
    }
}
