package com.proyecto.cupones.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.cupones.model.Usuario;
import com.proyecto.cupones.service.IUsuarioService;

@RestController
@RequestMapping(value="/api")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> buscarTodos(){
		return iUsuarioService.buscarTodas();
	}
	
	@PostMapping("/usuario")
	public Usuario guardar(@RequestBody Usuario usuario){
		iUsuarioService.guardar(usuario);
		return usuario;
	}
	
}
