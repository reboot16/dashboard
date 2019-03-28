package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Visi;

import java.util.List;

public interface VisiService {

    List<Visi> getAllVisi();
    List<Visi> getAllVisiByActive(boolean active);

    Visi createVisi(Visi visi);
    Visi updateVisi(int id, Visi visi);

    void deleteVisi(int id);
}
