package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.RiwayatPendidikan;

import java.util.List;

public interface RiwayatPendidikanService {

    List<RiwayatPendidikan> getAllRiwayatPendidikan();
    List<RiwayatPendidikan> getAllByJenjang(String jenjang);

    RiwayatPendidikan createRiwayatPendidikan(RiwayatPendidikan riwayatPendidikan);
    RiwayatPendidikan updateRiwayatPendidikan(int id, RiwayatPendidikan riwayatPendidikan);

    void deleteRiwayatPendidikan(int id);
}
