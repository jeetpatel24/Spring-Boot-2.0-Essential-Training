package com.frankmoley.lil.sbet.landon.roomwebapp.services;


import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<Room> roomList = new ArrayList<>();

    static {
        for(int i=0;i<10;i++) {
            roomList.add(new Room(i, "Room "+i, "R"+i, "Q"));
        }
    }

//    private final RoomRepository roomRepository;
//    public RoomService(RoomRepository roomRepository) {
//        this.roomRepository = roomRepository;
//    }

    public List<Room> getAllRooms() {
        return roomList;
    }
}
