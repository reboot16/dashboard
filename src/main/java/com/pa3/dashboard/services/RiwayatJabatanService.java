package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.RiwayatJabatan;

import java.util.List;

public interface RiwayatJabatanService {

    List<RiwayatJabatan> getAllRiwayatJabatan();
    List<RiwayatJabatan> getAllByActive(boolean active);

    RiwayatJabatan createRiwayatJabatan(RiwayatJabatan riwayatJabatan);
    RiwayatJabatan updateRiwayatJabatan(int id, RiwayatJabatan riwayatJabatan);

    void deleteRiwayatJabatan(int id);
}
