package com.proyecto.cupones.service;

import java.util.List;
import com.proyecto.cupones.model.Cupon;

public interface ICuponService {	
	void guardar(Cupon cupon);
	List<Cupon> buscarTodas();
}