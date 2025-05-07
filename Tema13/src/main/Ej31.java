package main;

import java.util.List;

import clases.Curso;
import dao.DaoCurso;

public class Ej31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso Micurso = new Curso(0, "1ºbachillerato");
		DaoCurso.inserta(Micurso);
		List<Curso> listaDeCursos= dao.DaoCurso.listaCurso();
		for (Curso cursos : listaDeCursos) {
			System.out.println(cursos.getIdCurso());
		}
		
	}

}
