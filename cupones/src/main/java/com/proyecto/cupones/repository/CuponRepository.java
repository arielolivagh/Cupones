package com.proyecto.cupones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.cupones.model.Cupon;

public interface CuponRepository extends JpaRepository<Cupon, Integer> {

}
