package com.example.Miniproject.Model;

import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "nguoiDung")
@Data
public class nguoiDung {
    @Id
    @GeneratedValue

    @Column(name = "tenNguoiDung")

    private String tenNguoiDung ;
    private String matKhau ;
    private String theLoai ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maSinhVien" )
    private sinhVien nguoiDungsinhVien;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maNhanVien")
    private nhanVien nguoiDungnhanVien;
}
