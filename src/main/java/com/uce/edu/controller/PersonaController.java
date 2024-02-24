package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.modelo.Persona;
import com.uce.edu.service.IPersonaService;

//http://localhost:8086/personas/buscarTodos
//http://localhost:8086/personas/buscar
//http://localhost:8086/personas/actualizar
//http://localhost:8086/personas/borrar
//http://localhost:8086/personas/guardar

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService iPersonaService;

	// Diferentes tipos de request
	// conocidos como verbos o métodos http

	// GET
	@GetMapping("/buscarTodos")
	public String buscarTodos(Model modelo) {
		List<Persona> lista = this.iPersonaService.consultarTodos();
		modelo.addAttribute("personas", lista);
		return "vistaListaPersonas";
	}

	// GET
	@GetMapping("/buscar")
	public String buscarPorCedula(String cedula) {
		return "";
	}

	// PUT
	@PutMapping("/actualizar")
	public String actualizar() {
		return "";
	}

	// DELETE
	@DeleteMapping("/borrar")
	public String borrar() {
		return "";
	}

	// POST
	@PostMapping("/guardar")
	public String guardar() {
		return "";
	}

}
