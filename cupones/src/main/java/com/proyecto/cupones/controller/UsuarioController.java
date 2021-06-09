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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value="Usuarios")
@RestController
@RequestMapping(value="/api")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@ApiOperation(value="Lista de usuarios",response=Usuario.class)
	@GetMapping("/usuarios")
	public List<Usuario> buscarTodos(){
		return iUsuarioService.buscarTodas();
	}
	
	@ApiOperation(value="Guarda usuario")
	@PostMapping("/usuario")
	public Usuario guardar(@ApiParam(value="Objeto Usuario",required = true) @RequestBody Usuario usuario){
		iUsuarioService.guardar(usuario);
		return usuario;
	}
	
}
