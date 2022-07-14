import java.util.ArrayList;
import java.util.List;

public class HotelFloor implements HotelRoomInterface {
    private List<HotelRoomInterface> hotelRooms = new ArrayList<HotelRoomInterface>();

    @Override
    public void book(String guestName) {
        hotelRooms.forEach(child -> {
            child.book(guestName);
        });
    }

    @Override
    public void clean() {
        hotelRooms.forEach(child -> {
            child.clean();
        });
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.add(hotelRoom);
        Logger.getInstance().log("Added room" + hotelRoom + " to " + this);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.remove(hotelRoom);
        Logger.getInstance().log("Removed room" + hotelRoom + " from " + this);

    }
}
