package com.pa3.dashboard.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@Table(name = "pengajaran")
public class Pengajaran {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pengajaran")
    private int id;

    @Column(name = "mata_kuliah")
    private String mataKuliah;

    @Column(name = "kelas")
    private String kelas;

    @Column(name = "jumlah_mahasiswa")
    private int jumlahMahasiswa;

    @Column(name = "sks")
    private int sks;

    @Column(name = "tahun_kurikulum")
    private int tahunKurikulum;

    @Column(name = "createdAt", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}
