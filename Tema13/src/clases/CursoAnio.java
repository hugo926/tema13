package clases;

public class CursoAnio {

	private int idCursoAnio;
	private Curso curso;
	private AnioEscolar anio;
	private Profesor idTutor;
	
	public CursoAnio()
	{
		
	}
	public CursoAnio(int idCursoAnio, Curso curso, AnioEscolar anio, Profesor idTutor) {
		super();
		this.idCursoAnio = idCursoAnio;
		this.curso = curso;
		this.anio = anio;
		this.idTutor = idTutor;
	}
	public int getIdCursoAnio() {
		return idCursoAnio;
	}
	public void setIdCursoAnio(int idCursoAnio) {
		this.idCursoAnio = idCursoAnio;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public AnioEscolar getAnio() {
		return anio;
	}
	public void setAnio(AnioEscolar anio) {
		this.anio = anio;
	}
	public Profesor getIdTutor() {
		return idTutor;
	}
	public void setIdTutor(Profesor idTutor) {
		this.idTutor = idTutor;
	}
	
}
