package clases;

import java.util.Date;

public class Alumno {
	
		private int idAlumno;
		private String nombre;
		private String apellidos;
		private String direccion; 
		private Date fechaNac; 
		private char sexo;
		
		public Alumno()
		{
			
		}
		
		public Alumno(String nombre,String apellidos) {
			super();
			this.nombre = nombre;
			this.apellidos=apellidos;
		}

		public Alumno(int idAlumno, String nombre, String apellidos, String direccion, Date fechaNac, char sexo) {
			super();
			this.idAlumno = idAlumno;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direccion = direccion;
			this.fechaNac = fechaNac;
			this.sexo = sexo;
		}
		public int getIdAlumno() {
			return idAlumno;
		}
		public void setIdAlumno(int idAlumno) {
			this.idAlumno = idAlumno;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Date getFechaNac() {
			return fechaNac;
		}
		public void setFechaNac(Date fechaNac) {
			this.fechaNac = fechaNac;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		@Override
		public String toString() {
			return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
					+ direccion + ", fechaNac=" + fechaNac + ", sexo=" + sexo + "]";
		} 
		
		
}
