package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.Booking;
import com.da.du_an.democode.repository.BookingRepository;
import com.da.du_an.democode.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getBooking() {
        return bookingRepository.findAll();
    }
}
