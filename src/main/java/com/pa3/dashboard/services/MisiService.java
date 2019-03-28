package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Misi;

import java.util.List;

public interface MisiService {

    List<Misi> getAllMisi();
    List<Misi> getAllMisiByActive(boolean active);

    Misi createMisi(Misi misi);
    Misi updateMisi(int id, Misi misi);

    void deleteMisi(int id);
}
