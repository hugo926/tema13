package main;

import java.util.List;

import clases.Asignatura;
import dao.DaoAsignatura;
import dao.DaoAsignaturaAnio;

public class Ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Asignatura> listaAsig = DaoAsignatura.lista();
		int contador =0;
		for (Asignatura asig : listaAsig) {
			contador++;
			System.out.println(contador +"-"+ asig);
		}

	}

}
