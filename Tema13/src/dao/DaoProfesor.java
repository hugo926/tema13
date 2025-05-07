package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clases.Curso;
import clases.Profesor;
import util.Conexion;

public class DaoProfesor {
	
	public static List<Profesor> listaProfes()
	{
		List<Profesor> listaDeProfes = new ArrayList<Profesor>();
		try {
			Connection con = Conexion.abreConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("Select * from profesor");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
			    	listaDeProfes.add(new Profesor(rs.getInt("idProfesor"), rs.getString("nombre") , rs.getString("email"), 
			    			rs.getBoolean("esdirector") ,rs.getBoolean("esjefeestudios")));
			    }
			    rs.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return listaDeProfes;
	}
	public static void inserta(Profesor prof)
	{
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("insert into profesor (nombre, email, esdirector, esjefeestudios)\r\n"
					+ "values (?,?,?,?); ", Statement.RETURN_GENERATED_KEYS);
			pst.setString(1,prof.getNombre());
			pst.setString(2,prof.getEmail());
			pst.setBoolean(3, prof.isEsdirector());
			pst.setBoolean(4, prof.isEsjefeestudios());
			
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			
			if (rs.next()) { //si en el siguiente hay datos
			prof.setIdProfesor(rs.getInt(1));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
	}
	
	public static boolean borrar(Profesor prof) {
		try {
			Connection con = Conexion.abreConexion();
			PreparedStatement pst = con.prepareStatement("select * from asignaturaanio \r\n"
					+ "inner join profesor on asignaturaanio.IdProfesor = profesor.idprofesor\r\n"
					+ "where profesor.nombre=?;"); //and not exists (select 
			pst.setString(1, prof.getNombre());
			ResultSet rs = pst.executeQuery(); 
			if (rs.next()) { //si en el siguiente hay datos
				System.out.println("No se puede borrar");
				return false;
				} else {
				borrarSIEMPRE(prof);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return false;
	}
	
	
	public static boolean borrarSIEMPRE(Profesor prof) {
		try {
			Connection con = Conexion.abreConexion();
			PreparedStatement pst = con.prepareStatement("delete from profesor where nombre = ?;");
			pst.setString(1, prof.getNombre());
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return true;
	}
}
