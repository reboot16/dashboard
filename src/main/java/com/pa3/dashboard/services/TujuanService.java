package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Tujuan;

import java.util.List;

public interface TujuanService {

    List<Tujuan> getAllTujuan();
    List<Tujuan> getAllTujuanByActive(boolean active);

    Tujuan createTujuan(Tujuan tujuan);
    Tujuan updateTujuan(int id, Tujuan tujuan);

    void deleteTujuan(int id);
}
