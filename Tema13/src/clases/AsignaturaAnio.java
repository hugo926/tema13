package clases;

public class AsignaturaAnio {
	
	private Asignatura asignatura;
	private CursoAnio cursoanio;
	private Profesor profesor;
	
	public AsignaturaAnio()
	{
		
	}
	
	public AsignaturaAnio(Asignatura asignatura, CursoAnio cursoanio, Profesor profesor) {
		super();
		this.asignatura = asignatura;
		this.cursoanio = cursoanio;
		this.profesor = profesor;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public CursoAnio getCursoanio() {
		return cursoanio;
	}

	public void setCursoanio(CursoAnio cursoanio) {
		this.cursoanio = cursoanio;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return asignatura.getAsignatura() + cursoanio.getCurso().getCurso() + cursoanio.getAnio().getAnio();
	}
	
}