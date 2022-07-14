import java.util.ArrayList;
import java.util.List;

public class HotelRoom implements HotelRoomInterface {
    private final List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();

    @Override
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    @Override
    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }

    public void checkIn(String guestName) {
        Logger.getInstance().log(guestName + " checked in");
        checkinObservers.forEach((checkinObserver -> checkinObserver.update(guestName)));
    }


}
