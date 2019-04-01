package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Pengajaran;

import java.util.List;

public interface PengajaranService {

    List<Pengajaran> getAllPengajaran();
    List<Pengajaran> getAllByMataKuliah(String mataKuliah);
    List<Pengajaran> getAllByTahunKurikulum(int tahunKurikulum);

    Pengajaran createPengajaran(Pengajaran pengajaran);
    Pengajaran updatePengajaran(int id, Pengajaran pengajaran);

    void deletePengajaran(int id);
}
