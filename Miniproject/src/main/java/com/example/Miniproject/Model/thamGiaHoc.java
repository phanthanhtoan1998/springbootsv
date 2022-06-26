package com.example.Miniproject.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "thamGiaHoc")
public class thamGiaHoc {

    @EmbeddedId
    private CourseRatingKey id;

    @ManyToOne
    @MapsId("maLopHocPhan")

    @JoinColumn(name = "maLopHocPhan")
    private lopHocPhan thamGiaHoclopHocPhan;

    @ManyToOne
    @MapsId("maSinhVien")
    @JoinColumn(name = "maSinhVien")
    private sinhVien thamGiaHocsinhVien;

    private  Float diemSo ;
    private String diemChu ;
    public thamGiaHoc() {

    }

}
