package com.youtube2.gradle2.repository;

import com.youtube2.gradle2.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository <Room, Long> {

    Room findByRoomNumber(String roomNumber);


}
