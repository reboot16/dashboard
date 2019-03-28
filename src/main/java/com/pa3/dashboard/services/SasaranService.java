package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Sasaran;

import java.util.List;

public interface SasaranService {

    List<Sasaran> getAllSasaran();
    List<Sasaran> getALlSasaranByActive(boolean active);

    Sasaran createSasaran(Sasaran sasaran);
    Sasaran updateSasaran(int id, Sasaran sasaran);

    void deleteSasaran(int id);
}
