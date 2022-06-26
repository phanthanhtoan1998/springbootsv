package com.example.Miniproject.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "monHoc")
@Data
public class monHoc {
    @Id
    @GeneratedValue
    @Column(name = "maMonHoc")
    private String maMonHoc;
    private String tenMonHoc;
    private Float soTinChi;
    private int namBatDauApDung;
    private String theLoai;
    private String moTaTomTat;
    private String moTaDayDu;
    private String taiLieu;
    private String mucTieuDauRa;
    private String hinhThucDanhGia;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monHocchuongTrinhDaoTao_id", nullable = false)
    private chuongTrinhDaoTao monHocchuongTrinhDaoTao;
//    @OneToMany(mappedBy = "lopHocPhanmonHoc", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private Set<lopHocPhan> lopHocPhan ;

public  monHoc(){}


    @Override
    public String toString() {
        return "monHoc{" +
                "maMonHoc='" + maMonHoc + '\'' +
                ", tenMonHoc='" + tenMonHoc + '\'' +
                ", soTinChi=" + soTinChi +
                ", namBatDauApDung=" + namBatDauApDung +
                ", theLoai='" + theLoai + '\'' +
                ", moTaTomTat='" + moTaTomTat + '\'' +
                ", moTaDayDu='" + moTaDayDu + '\'' +
                ", taiLieu='" + taiLieu + '\'' +
                ", mucTieuDauRa='" + mucTieuDauRa + '\'' +
                ", hinhThucDanhGia='" + hinhThucDanhGia + '\'' +
                ", monHocchuongTrinhDaoTao=" + monHocchuongTrinhDaoTao +
                '}';
    }

}
