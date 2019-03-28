package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Event;

import java.util.Date;
import java.util.List;

public interface EventService {

    List<Event> getALlEvent();
    List<Event> getAllByDate(Date waktu);

    Event createEvent(Event event);
    Event updateEvent(int id, Event event);

    void deleteEvenr(int id);
}
