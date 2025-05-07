package main;

import java.util.List;
import java.util.Scanner;

import clases.Profesor;
import dao.DaoProfesor;
import util.Validarfunciones;

public class Ej34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Profesor> listaDeProfes= dao.DaoProfesor.listaProfes();
		for (Profesor profesores : listaDeProfes) {
			System.out.println(profesores);
		}
		Scanner sc = new Scanner(System.in);
		String nombre = Validarfunciones.dimeString("Dame el nombre de un profe", sc);
		Profesor prof = new Profesor(nombre);
		
		boolean entra= false;
		DaoProfesor.borrar(prof);
		entra=true;
		
		if (entra) {
			System.out.println("lo he borrado");
			
		}
		else {
			System.out.println("no lo he borrado");
		}
		

	}
	}
