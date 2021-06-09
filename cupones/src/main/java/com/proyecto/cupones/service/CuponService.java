package com.proyecto.cupones.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.proyecto.cupones.model.Cupon;
import com.proyecto.cupones.repository.CuponRepository;

@Service
@Primary
public class CuponService implements ICuponService {

	@Autowired
	private CuponRepository cuponRepository;
	
	@Override
	public void guardar(Cupon cupon) {
		cuponRepository.save(cupon);

	}

	@Override
	public List<Cupon> buscarTodas() {
		return cuponRepository.findAll();
	}

}
