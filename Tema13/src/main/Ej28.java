package main;

import java.util.List;
import java.util.Scanner;

import clases.AsignaturaAnio;
import dao.DaoAsignaturaAnio;
import util.Validarfunciones;

public class Ej28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String profesor = Validarfunciones.dimeString("Indica profesor", sc);
		List<AsignaturaAnio> lista = DaoAsignaturaAnio.lista(profesor);
		for (AsignaturaAnio c:lista) {
			System.out.println(c);	
		}
		
	}

}