package machinecoding.bookmyshow.entities;

import machinecoding.bookmyshow.enums.SeatStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Show {
    Movie movie;
    LocalDateTime startTime;
    LocalDateTime endTime;
    Map<String, SeatStatus> seatStatusMap;//String is seatNumber
    Map<String, ReentrantLock> locks;

    public boolean blockSeats(List<String> selectedSeatNumbers) throws InterruptedException {

        try {
            for (String selectedSeatNumber : selectedSeatNumbers) {
                ReentrantLock lock = locks.get(selectedSeatNumber);
                if (lock.tryLock(30000L, TimeUnit.MILLISECONDS)) {
                    seatStatusMap.put(selectedSeatNumber, SeatStatus.LOCKED);
                    if (seatStatusMap.containsKey(selectedSeatNumber) && !seatStatusMap.get(selectedSeatNumber).equals(SeatStatus.AVAILABLE)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            for (String selectedSeatNumber : selectedSeatNumbers) {
                seatStatusMap.put(selectedSeatNumber, SeatStatus.BOOKED);
            }

            return true;

        } finally {
            for (String selectedSeatNumber : selectedSeatNumbers) {
                ReentrantLock lock = locks.get(selectedSeatNumber);
                lock.unlock();
            }
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Map<String, SeatStatus> getSeatStatusMap() {
        return seatStatusMap;
    }
}
