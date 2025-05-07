package clases;

import java.util.Date;

	public class AlumnoCurso {
		private int idAlumnoCurso;
		private CursoAnio cursoanio;
		private Alumno alumno;
		private Date fechamatricula;
		private double notaMedia;
		public AlumnoCurso()
		{
			
		}
		
		public AlumnoCurso(Alumno alumno, double notaMedia) {
			super();
			this.alumno = alumno;
			this.notaMedia = notaMedia;
		}

		public AlumnoCurso(int idAlumnoCurso, CursoAnio cursoanio, Alumno alumno, Date fechamatricula, double notaMedia) {
			super();
			this.idAlumnoCurso = idAlumnoCurso;
			this.cursoanio = cursoanio;
			this.alumno = alumno;
			this.fechamatricula = fechamatricula;
			this.notaMedia = notaMedia;
		}

		public int getIdAlumnoCurso() {
			return idAlumnoCurso;
		}
		public void setIdAlumnoCurso(int idAlumnoCurso) {
			this.idAlumnoCurso = idAlumnoCurso;
		}
		public Alumno getAlumno() {
			return alumno;
		}
		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}
		public Date getFechamatricula() {
			return fechamatricula;
		}
		public void setFechamatricula(Date fechamatricula) {
			this.fechamatricula = fechamatricula;
		}
		public double getNotaMedia() {
			return notaMedia;
		}
		public void setNotaMedia(double notaMedia) {
			this.notaMedia = notaMedia;
		}

		public CursoAnio getCursoanio() {
			return cursoanio;
		}

		public void setCursoanio(CursoAnio cursoanio) {
			this.cursoanio = cursoanio;
		}
	
}
