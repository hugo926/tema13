package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clases.Curso;
import util.Conexion;

public class DaoCurso {
	
	public static List<Curso> listaCurso()
	{
		List<Curso> listaDeCursos = new ArrayList<Curso>();
		try {
			Connection con = Conexion.abreConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("Select idCurso, Curso from curso order by Curso asc");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
			    	listaDeCursos.add(new Curso(rs.getInt("idCurso"), rs.getString("Curso")));
			    }
			    rs.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return listaDeCursos;
	}
	
	public static void inserta(Curso curso)
	{
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("insert into curso (Curso)\r\n"
					+ "values (?); ", Statement.RETURN_GENERATED_KEYS);
			pst.setString(1,curso.getCurso());
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()) {
			curso.setIdCurso(rs.getInt(1));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
	}
}
