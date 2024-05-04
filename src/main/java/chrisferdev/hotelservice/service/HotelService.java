package chrisferdev.hotelservice.service;

import java.util.List;

import chrisferdev.hotelservice.entity.Hotel;

public interface HotelService {
    
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);
}
