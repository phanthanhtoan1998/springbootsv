package com.example.Miniproject.Model;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sinhVien")
@Data

public class sinhVien {
    @Id
    @GeneratedValue
    @Column(name = "maSinhVien")
    private String maSinhVien;
    @Column(name = "hoDem" )

    private String hoDem;
    @Column(name = "ten")

    private String ten;
    @Column(name = "ngaySinh",columnDefinition="Date" )

    private Date ngaySinh;
    @Column(name = "namNhapHoc")

    private int namNhapHoc;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sinhVienchuongTrinhDaoTao_id", nullable = false)

    private chuongTrinhDaoTao sinhVienchuongTrinhDaoTao;

//    @OneToOne(mappedBy = "nguoiDungsinhVien")
//    private nguoiDung nguoiDung;
//    @OneToMany(mappedBy = "thamGiaHocsinhVien", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    @Fetch(value = FetchMode.SUBSELECT)
//    private Set<thamGiaHoc> thamGiaHoc;

    public sinhVien() {
    }



    @Override
    public String toString() {
        return "sinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoDem='" + hoDem + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", namNhapHoc=" + namNhapHoc +
                ", sinhVienchuongTrinhDaoTao=" + sinhVienchuongTrinhDaoTao +
                '}';
    }



}
