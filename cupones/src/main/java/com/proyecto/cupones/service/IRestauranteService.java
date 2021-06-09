package com.proyecto.cupones.service;

import java.util.List;
import com.proyecto.cupones.model.Restaurante;

public interface IRestauranteService {	
	void guardar(Restaurante restaurante);
	List<Restaurante> buscarTodas();
}