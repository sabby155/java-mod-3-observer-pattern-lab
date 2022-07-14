import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    public static void main(String[] args) {

        Logger.getInstance().log("Managing hotel...");



        // create hotel rooms
        List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();


        HotelRoom hotelRoomOne = new HotelRoom();
        hotelRooms.add(hotelRoomOne);

        HotelRoom hotelRoomTwo = new HotelRoom();
        hotelRooms.add(hotelRoomTwo);

        HotelRoom hotelRoomThree = new HotelRoom();
        hotelRooms.add(hotelRoomThree);

        HotelRoom hotelRoomFour = new HotelRoom();
        hotelRooms.add(hotelRoomFour);

        HotelRoom hotelRoomFive = new HotelRoom();
        hotelRooms.add(hotelRoomFive);

        // create hotel floors

        HotelFloor hotelFloorOne = new HotelFloor();


        HotelFloor hotelFloorTwo = new HotelFloor();


        HotelFloor hotelFloorThree = new HotelFloor();


        // add hotel rooms to hotel floors

        hotelRooms.forEach(room -> {
            hotelFloorOne.addHotelRoom(room);
        });

        hotelRooms.forEach(room -> {
            hotelFloorTwo.addHotelRoom(room);
        });

        hotelRooms.forEach(room -> {
            hotelFloorThree.addHotelRoom(room);
        });


        // create hotel email and notification services

        HotelEmailService emailService = new HotelEmailService();
        HotelPushNotificationService notificationService = new HotelPushNotificationService();
        // initialize hotel email and notification services
        // ...
        hotelRooms.forEach((hotelRoom) -> {
            hotelRoom.addCheckinObserver(emailService);
            hotelRoom.addCheckinObserver(notificationService);
        });
        
        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        // behaviors
        hotelRoomOne.book("Sabrina");
        hotelRoomOne.checkIn("Sabrina");

        hotelRoomTwo.book("Stacy");
        hotelRoomTwo.checkIn("Stacy");

        hotelRoomThree.book("Dave");
        hotelRoomThree.checkIn("Dave");

        hotelRoomFour.book("Alex");
        hotelRoomFour.checkIn("Alex");
    }
}
