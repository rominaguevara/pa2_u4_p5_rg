package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Persona;
import com.uce.edu.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository iPersonaRepository;
	
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepository.actualizar(persona);
	}

	@Override
	public Persona consultarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.consultarPorCedula(cedula);
	}

	@Override
	public void borrarPorCedula(String cedula) {
		// TODO Auto-generated method stub	
		this.iPersonaRepository.eliminarPorCedula(cedula);
	}

	@Override
	public List<Persona> consultarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.consultarTodos();
	}

}
