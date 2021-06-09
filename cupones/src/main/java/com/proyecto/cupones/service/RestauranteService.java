package com.proyecto.cupones.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.proyecto.cupones.model.Restaurante;
import com.proyecto.cupones.repository.RestauranteRepository;

@Service
@Primary
public class RestauranteService implements IRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Override
	public void guardar(Restaurante restaurante) {
		restauranteRepository.save(restaurante);

	}

	@Override
	public List<Restaurante> buscarTodas() {
		return restauranteRepository.findAll();
	}

}
