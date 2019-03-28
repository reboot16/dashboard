package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List<Mahasiswa> getAllMahasiswa();
    List<Mahasiswa> getAllByActive(boolean active);

    Mahasiswa createMahasiswa(Mahasiswa mahasiswa);
    Mahasiswa updateMahasiswa(int id, Mahasiswa mahasiswa);

    void deleteMahasiswa(int id);
}
