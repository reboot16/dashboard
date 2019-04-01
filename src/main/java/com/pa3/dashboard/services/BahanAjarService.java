package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.BahanAjar;

import java.util.List;

public interface BahanAjarService {

    List<BahanAjar> getAllBahanAjar();
    List<BahanAjar> getAllByJudul(String judul);

    BahanAjar createBahanAjar(BahanAjar bahanAjar);
    BahanAjar updateBahanAjar(int id, BahanAjar bahanAjar);

    void deleteBahanAjar(int id);
}
