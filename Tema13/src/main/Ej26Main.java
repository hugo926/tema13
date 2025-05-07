package main;
import java.util.List;

import clases.Curso;
import dao.DaoCurso;

public class Ej26Main {

	public static void main(String[] args) {
		
		List<Curso> listaDeCursos = DaoCurso.listaCurso();
		for (Curso curso : listaDeCursos) {
			System.out.println(curso);
		}
	}

}
