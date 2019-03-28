package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    Event findAllByWaktu(Date waktu);
}
