package clases;

public class AnioEscolar {

	private int idAnio;
	private String anio;
	private boolean activo;
	
	public AnioEscolar()
	{
		
	}
	public AnioEscolar(String anio) {
		super();
		this.anio = anio;
	}
	public AnioEscolar(int idAnio, String anio, boolean activo) {
		super();
		this.idAnio = idAnio;
		this.anio = anio;
		this.activo = activo;
	}

	public int getIdAnio() {
		return idAnio;
	}

	public void setIdAnio(int idAnio) {
		this.idAnio = idAnio;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}