package com.midominio.evaluable1.model;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	
	//propiedades
	
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numeroDeAlumnosMatriculados;
	
     //constructores
	
	public Asignatura(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int numeroDeAlumnosMatriculados) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numeroDeAlumnosMatriculados = numeroDeAlumnosMatriculados;
		
	}
	
	//Getters
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public int getNumeroCreditos() {
		return numeroCreditos;
	}
	public int getNumeroDeAlumnosMatriculados() {
		return numeroDeAlumnosMatriculados;
	}
	
	public static List<Asignatura> dameListaDeAsignatura(){
		
		//declaración de una lista para almacenar las asignaturas
		
		List<Asignatura> listaAsignaturas = new ArrayList<>();
		
		//agregar las 20 asignaturas a la lista
		
		listaAsignaturas.add(new Asignatura (1, "Matemáticas", "Matemáticas básicas", "ciencias", 6,0));
		listaAsignaturas.add(new Asignatura (2, "Lengua castellana", "Determinantes", "letras", 5,0));
		listaAsignaturas.add(new Asignatura (3, "Historia", "Prehistoria", "humanidades", 5,0));
		listaAsignaturas.add(new Asignatura (4, "Química", "Átomos", "ciencias", 6,0));
		listaAsignaturas.add(new Asignatura (5, "Física", "La materia", "ciencias", 7,0));
		listaAsignaturas.add(new Asignatura (6, "Francés", "Presentaciones", "letras", 5,0));
		listaAsignaturas.add(new Asignatura (7, "Educación Física", "Calentamientos", "humanidades", 6,0));
		listaAsignaturas.add(new Asignatura (8, "Arte", "Historia del arte", "humanidades", 5,0));
		listaAsignaturas.add(new Asignatura (9, "Música", "Instrumentos musicales", "humanidades", 7,0));
		listaAsignaturas.add(new Asignatura (10, "Geografía", "Mapa de España", "humanidades", 5,0));
		listaAsignaturas.add(new Asignatura (11, "Economía", "Sistemas económicos", "ciencias", 7,0));
		listaAsignaturas.add(new Asignatura (12, "Informática", "sistemas operativos", "ciencias", 9,0));
		listaAsignaturas.add(new Asignatura (13, "Psicología", "La mente y comportamiento humano", "humanidades", 6,0));
		listaAsignaturas.add(new Asignatura (14, "Sociología", "La sociedad y sus interacciones", "humanidades", 5,0));
		listaAsignaturas.add(new Asignatura (15, "Literatura", "Miguel de Cervantes", "letras", 5,0));
		listaAsignaturas.add(new Asignatura (16, "Finanzas", "Finanzas básicas", "ciencias", 6,0));
		listaAsignaturas.add(new Asignatura (17, "Ingeniería", "Ingeniería básica", "ciencias", 8,0));
		listaAsignaturas.add(new Asignatura (18, "Biología", "Células", "ciencias", 6,0));
		listaAsignaturas.add(new Asignatura (19, "Alemán", "Saludos en alemán", "letras", 5,0));
		listaAsignaturas.add(new Asignatura (20, "Álgebra", "Álgebra básica", "ciencias", 7,0));
		
		return listaAsignaturas;
		
	}

}
