package chrisferdev.hotelservice.service.impl;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chrisferdev.hotelservice.entity.Hotel;
import chrisferdev.hotelservice.exceptions.ResourceNotFoundException;
import chrisferdev.hotelservice.repository.HotelRepository;
import chrisferdev.hotelservice.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel no encontrado con el ID : " + id));
    }
    
}
