package main;

import java.util.List;
import java.util.Scanner;

import clases.Profesor;
import dao.DaoProfesor;
import util.Validarfunciones;

public class Ej33 {

	public static void main(String[] args) {
		// TODO Auto-generated method
	
		List<Profesor> listaDeProfes= dao.DaoProfesor.listaProfes();
		for (Profesor profesores : listaDeProfes) {
			System.out.println(profesores);
		}
		Scanner sc = new Scanner(System.in);
		String nombre = Validarfunciones.dimeString("Dame el nombre de un profe", sc);
		Profesor prof = new Profesor(nombre);
		DaoProfesor.borrarSIEMPRE(prof);
		System.out.println("He borrado a "+nombre);

	}
	

}
