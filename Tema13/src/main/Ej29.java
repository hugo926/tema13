package main;

import java.util.List;
import java.util.Scanner;

	import dao.DaoAlumnoCurso;
	import clases.AlumnoCurso;

	public class Ej29 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indica el curso");
			String curso = sc.nextLine();
			List<AlumnoCurso> lista = DaoAlumnoCurso.lista(curso);
			boolean entra=false;
			for (AlumnoCurso c:lista) {
				entra=true;
				System.out.println(c.getAlumno().getNombre() + " " + c.getAlumno().getApellidos() + " " + (c.getNotaMedia()<5?"no":"") + " pasa de curso");
			}
			if(!entra)
				System.out.println("No hay alumnos");
			sc.close();
		}

	}
