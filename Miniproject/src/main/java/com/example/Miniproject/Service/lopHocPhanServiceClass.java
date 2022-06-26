package com.example.Miniproject.Service;

import com.example.Miniproject.Model.lopHocPhan;
import com.example.Miniproject.Repositories.lopHocPhanRepositories;
import net.bytebuddy.implementation.bind.annotation.This;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class lopHocPhanServiceClass implements lopHocPhanService{

    private  final lopHocPhanRepositories LopHocPhanRepositories ;
    public lopHocPhanServiceClass(lopHocPhanRepositories LopHocPhanRepositories){
        super();
        this.LopHocPhanRepositories = LopHocPhanRepositories;

    }

    @Override
    public List<lopHocPhan> getAlllopHocPhan() {
        return LopHocPhanRepositories.findAll();
    }

    @Override
    public lopHocPhan insertlopHocPhan(lopHocPhan lophocphan) {
//         Optional<lopHocPhan> lopHocPhan=LopHocPhanRepositories.findById(lophocphan.);
        return  LopHocPhanRepositories.save(lophocphan) ;
    }
}
