package com.delivery.service.impl;

import com.delivery.model.Tracking;
import com.delivery.repository.TrackingRepository;
import com.delivery.service.TrackingService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TrackingServiceImpl implements TrackingService {
    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public Tracking createTracking(Tracking tracking) {
        return trackingRepository.save(tracking);
    }

    @Override
    public Tracking getTrackingById(String id) {
        return trackingRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tracking> getAllTracking() {
        return trackingRepository.findAll();
    }

    @Override
    public Tracking updateTracking(String id, Tracking tracking) {
        if (trackingRepository.existsById(id)) {
            tracking.setId(id);
            return trackingRepository.save(tracking);
        } else {
            return null;
        }
    }

    @Override
    public void deleteTracking(String id) {
        trackingRepository.deleteById(id);
    }

    @Override
    public void updateDeliveryLocation(String orderId, double latitude, double longitude) {
        Tracking tracking = trackingRepository.findByOrderId(orderId);
        if (tracking != null) {
            tracking.setCurrentLatitude(latitude);
            tracking.setCurrentLongitude(longitude);
            tracking.setLastUpdate(new Date());
            trackingRepository.save(tracking);
        }
    }
}

