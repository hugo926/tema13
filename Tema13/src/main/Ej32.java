package main;

import java.util.List;

import clases.Profesor;
import dao.DaoProfesor;

public class Ej32 {

	public static void main(String[] args) {
		Profesor MiProfe = new Profesor(0,"peoe","peoe@gmail.com",false,false);
		DaoProfesor.inserta(MiProfe);
		List<Profesor> listaDeProfes= dao.DaoProfesor.listaProfes();
		for (Profesor profesores : listaDeProfes) {
			System.out.println(profesores);
		}
		
	}
}
