package chrisferdev.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.hotelservice.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{
    
}
