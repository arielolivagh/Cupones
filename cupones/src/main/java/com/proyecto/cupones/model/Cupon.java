package com.proyecto.cupones.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="cupon")
public class Cupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String descripcion;

	@OneToOne
	@JoinColumn(name = "id_usuario",insertable=false,updatable=false) 
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "id_restaurante",insertable=false,updatable=false) 
	private Restaurante restaurante;
		
	private String vigencia;
	private String usado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getVigencia() {
		return vigencia;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	public String getUsado() {
		return usado;
	}
	public void setUsado(String usado) {
		this.usado = usado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	
	
}