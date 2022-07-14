public class HotelEmailService implements RoomCheckinObserver {
    @Override
    public void update(Object guestName) {
        Logger.getInstance().log("Sent email update to " + guestName);
    }
}
