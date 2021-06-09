package com.proyecto.cupones.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.proyecto.cupones.model.Usuario;
import com.proyecto.cupones.repository.UsuarioRepository;

@Service
@Primary
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void guardar(Usuario usuario) {
		usuarioRepository.save(usuario);

	}

	@Override
	public List<Usuario> buscarTodas() {
		return usuarioRepository.findAll();
	}

}
