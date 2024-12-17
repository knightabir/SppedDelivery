package com.delivery.service;

import com.delivery.model.Tracking;

import java.util.List;

public interface TrackingService {
    Tracking createTracking(Tracking tracking);
    Tracking getTrackingById(String id);
    List<Tracking> getAllTracking();
    Tracking updateTracking(String id, Tracking tracking);
    void deleteTracking(String id);
    void updateDeliveryLocation(String orderId, double latitude, double longitude);
}
