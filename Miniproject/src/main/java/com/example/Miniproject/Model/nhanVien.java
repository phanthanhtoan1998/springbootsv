package com.example.Miniproject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "nhanVien")
@Data
@NoArgsConstructor
public class nhanVien {
    @Id
    @GeneratedValue
    @Column(name = "maNhanVien")

    private int maNhanVien;
    private String hoDem;
    private String ten;
    private String theLoai;
    private Date ngaySinh;
    private int gioiTinh;
    @OneToOne(mappedBy = "nguoiDungnhanVien")
    private nguoiDung nguoiDung;
    @OneToMany(mappedBy = "lopHocPhannhanVien", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<lopHocPhan> lopHocPhan ;


}
