package com.proyecto.cupones.service;

import java.util.List;
import com.proyecto.cupones.model.Usuario;

public interface IUsuarioService {	
	void guardar(Usuario usuario);
	List<Usuario> buscarTodas();
}