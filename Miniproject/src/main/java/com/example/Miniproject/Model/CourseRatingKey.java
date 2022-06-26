package com.example.Miniproject.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CourseRatingKey implements Serializable {
    @Column(name = "maLopHocPhan")
    String maLopHocPhan;

    @Column(name = "maSinhVien")
    String maSinhVien;
}
