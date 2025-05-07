package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Asignatura;
import clases.Curso;
import util.Conexion;

public class DaoAsignatura {
	public static List<Asignatura> lista()
	{
		List<Asignatura> lista = new ArrayList<Asignatura>();
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("select a.idAsignatura,a.Asignatura, b.idcurso, b.curso\r\n"
					+ "from asignatura a \r\n"
					+ "inner join curso b\r\n"
					+ "on b.idcurso = a.idcurso\r\n"
					+ "order by b.curso asc, a.asignatura asc");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				//creo objeto asignatura y lo añado a la lista
				lista.add(new Asignatura(rs.getInt("Idasignatura"),rs.getString("asignatura"),new Curso(rs.getInt("idcurso"),rs.getString("curso"))));
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
