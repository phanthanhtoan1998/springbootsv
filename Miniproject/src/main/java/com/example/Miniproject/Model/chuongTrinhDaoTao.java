package com.example.Miniproject.Model;

import lombok.Data;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chuongTrinhDaoTao")
@Data
public class chuongTrinhDaoTao {
    @Id
    @GeneratedValue
    @Column(name = "maChuongTrinhDaoTao")
    private String maChuongTrinhDaoTao;
    private String tenChuongTrinhDaoTao;
    private Float soTinChi;

    private int namBatDauDaoTao;
    @OrderColumn
    @OneToMany(mappedBy = "monHocchuongTrinhDaoTao", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<monHoc> monHoc;
    @OneToMany(mappedBy = "sinhVienchuongTrinhDaoTao", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<sinhVien> sinhVien;

    public chuongTrinhDaoTao() {
    }

    public chuongTrinhDaoTao(String maChuongTrinhDaoTao ,String tenChuongTrinhDaoTao, Float soTinChi, int namBatDauDaoTao) {
        this.tenChuongTrinhDaoTao = tenChuongTrinhDaoTao;
        this.soTinChi = soTinChi;
        this.namBatDauDaoTao = namBatDauDaoTao;
    }

    @Override
    public String toString() {
        return "chuongTrinhDaoTao{" +
                "maChuongTrinhDaoTao='" + maChuongTrinhDaoTao + '\'' +
                ", tenChuongTrinhDaoTao='" + tenChuongTrinhDaoTao + '\'' +
                ", soTinChi=" + soTinChi +
                ", namBatDauDaoTao=" + namBatDauDaoTao +
                '}';
    }


}
