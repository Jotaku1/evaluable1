package com.midominio.evaluable1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable1.model.Asignatura;

@Controller
@RequestMapping("/asignatura/list")
public class AsignaturaController {
	
	@ModelAttribute ("titulo")
	public String tituloGeneral () {
		return "Evaluación";
	
	}

	@GetMapping ("/con")
	public String listaAsignaturaNumeroAlumnos(Model model) {
		
		model.addAttribute("H1", "Esta es la relación de alumnos");
		model.addAttribute("listadoAsignatura", Asignatura.dameListaDeAsignatura());
		
		return "list";
	}
	
	
}
