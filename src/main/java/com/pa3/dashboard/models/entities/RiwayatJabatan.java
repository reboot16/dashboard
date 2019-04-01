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
@Table(name = "riwayat_jabatan")
public class RiwayatJabatan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_riwayat_jabatan")
    private int id;

    @Column(name = "jabatan_fungsional")
    private String jabatanFungsional;

    @Column(name = "nomor_sk")
    private String nomorSK;

    @Column(name = "tanggal_mulai")
    @Temporal(TemporalType.DATE)
    private Date tanggalMulai;

    @Column(name = "createdAt", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}