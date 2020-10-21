package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Hocsinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HocSinhRepository extends JpaRepository<Hocsinh,Integer> {

    @Query(value = "SELECT*FROM hocsinh WHERE mahocsinh=?1",nativeQuery = true)
    Hocsinh finrBymhs(String mahocsinh);
}
