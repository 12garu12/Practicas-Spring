package com.youtube2.gradle2.Rest;

import com.youtube2.gradle2.model.Room;
import com.youtube2.gradle2.repository.RoomRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomController {

    private RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> findAll(@RequestParam(required = false) String roomNumber){

        List<Room> rooms = (List<Room>) roomRepository.findAll();

        if (roomNumber != null){
            List<Room> rooms1 = new ArrayList<>();
            rooms1.add(roomRepository.findByRoomNumber(roomNumber));
            return rooms1;
        }
        /*List<Room> rooms = new ArrayList<>();

        if (roomNumber == null){
            Iterable<Room> results = this.roomRepository.findAll();
            results.forEach(room -> {
                rooms.add(room);
            });
        }else {
            Room room = this.roomRepository.findByRoomNumber(roomNumber);

            if (room != null){
                rooms.add(room);
            }
        }
        return rooms;*/

        return rooms;
    }

}
