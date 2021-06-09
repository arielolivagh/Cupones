package com.proyecto.cupones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.cupones.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
