package clases;

public class Asignatura {
	
	 private int idAsignatura;
	 private String Asignatura;
	 private Curso curso;
	
	 public Asignatura() {
		super();
	}

	public Asignatura(int idAsignatura, String asignatura, Curso curso) {
		super();
		this.idAsignatura = idAsignatura;
		Asignatura = asignatura;
		this.curso = curso;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getAsignatura() {
		return Asignatura;
	}

	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return  Asignatura  +" "+ "("+curso.getCurso()+")";
	}
	 
	 

}
