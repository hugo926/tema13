package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.AnioEscolar;
import clases.Asignatura;
import clases.AsignaturaAnio;
import clases.Curso;
import clases.CursoAnio;
import util.Conexion;

public class DaoAsignaturaAnio {
	public static List<AsignaturaAnio> lista(String profesor)
	{
		List<AsignaturaAnio> lista = new ArrayList<AsignaturaAnio>();
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("select c.Asignatura, e.idcurso, e.Curso, f.Anio\r\n"
					+ "from asignaturaanio a\r\n"
					+ "inner join profesor b on b.idprofesor = a.idprofesor\r\n"
					+ "inner join asignatura c on c.idasignatura = a.idasignatura\r\n"
					+ "inner join cursoanio d on d.idcursoanio = a.idcursoanio\r\n"
					+ "inner join curso e on e.idcurso = d.idcurso\r\n"
					+ "inner join anioescolar f on f.idanio=d.idanio\r\n"
					+ "where b.nombre=?");
			pst.setString(1,profesor);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				//creo objeto asignaturaanio y lo añado a la lista
				Curso curso = new Curso(rs.getInt("idcurso"), rs.getString("curso"));
				AnioEscolar anioEscolar = new AnioEscolar(rs.getString("anio"));
				Asignatura asi = new Asignatura(0, rs.getString("asignatura"), curso);
				CursoAnio cursoAnio = new CursoAnio(rs.getInt("idcurso"), curso, anioEscolar, null);
				AsignaturaAnio asiAnio=new AsignaturaAnio(asi,cursoAnio,null);
				lista.add(asiAnio);
				
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return lista;
	}
}
