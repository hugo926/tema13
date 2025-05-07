package clases;

public class Profesor {
	
		private int idProfesor;
		private String nombre,email;
		private boolean esdirector,esjefeestudios;
		public Profesor()
		{
			
		}
		public Profesor(String nombre) {
			super();
			this.nombre = nombre;
		}
		public Profesor(int idProfesor, String nombre, String email, boolean esdirector, boolean esjefeestudios) {
			super();
			this.idProfesor = idProfesor;
			this.nombre = nombre;
			this.email = email;
			this.esdirector = esdirector;
			this.esjefeestudios = esjefeestudios;
		}
		
		public int getIdProfesor() {
			return idProfesor;
		}
		public void setIdProfesor(int idProfesor) {
			this.idProfesor = idProfesor;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isEsdirector() {
			return esdirector;
		}
		public void setEsdirector(boolean esdirector) {
			this.esdirector = esdirector;
		}
		public boolean isEsjefeestudios() {
			return esjefeestudios;
		}
		public void setEsjefeestudios(boolean esjefeestudios) {
			this.esjefeestudios = esjefeestudios;
		}
		@Override
		public String toString() {
			return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", email=" + email + ", esdirector="
					+ esdirector + ", esjefeestudios=" + esjefeestudios + "]";
		}
		
		
}
