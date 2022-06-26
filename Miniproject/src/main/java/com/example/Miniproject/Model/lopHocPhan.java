package com.example.Miniproject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lopHocPhan")
@Data

@NoArgsConstructor
public class lopHocPhan {
    @Id
    @GeneratedValue
    @Column(name = "maLopHocPhan")
    private  int maLopHocPhan ;
    private int namHoc ;
    private String hocKy ;
    private String ngonNguGiangDay ;
    private String moTa ;
    private int gioiHanSoLuongSinhVien ;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "maNhanVien", nullable = false)
    private nhanVien lopHocPhannhanVien;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "maMonHoc", nullable = false)
    private monHoc lopHocPhanmonHoc;



    @OneToMany(mappedBy = "thamGiaHoclopHocPhan", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)

    @Fetch(value = FetchMode.SUBSELECT)
    private Set<thamGiaHoc> thamGiaHoc ;






}
