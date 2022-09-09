package com.muhammet.bootstrap.repository;

import com.muhammet.bootstrap.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri,Long> {
}
