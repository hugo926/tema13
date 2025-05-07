package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import clases.Alumno;
import util.Conexion;
import util.Validarfunciones;

public class DaoAlumno {
		public static Alumno busca(String nombre, String apellidos)
		{
			Alumno a=null;
			try {
				//abro conexion
				Connection con = Conexion.abreConexion();
				//genero el sql
				PreparedStatement pst = con.prepareStatement("select idalumno, nombre, fechanac, sexo, apellidos, direccion from alumno where nombre=? and apellidos=?");
				pst.setString(1,nombre);
				pst.setString(2,apellidos);
				ResultSet rs = pst.executeQuery();
				if(rs.next())
				{
					a = new Alumno(rs.getInt("idAlumno"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("direccion"), rs.getDate("fechaNac"), rs.getString("sexo").charAt(0));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				Conexion.cierraConexion();
			}
			return a;
		}
		
		public static void actualiza(Alumno a)
		{
			try {
				//abro conexion
				Connection con = Conexion.abreConexion();
				//genero el sql
				PreparedStatement pst = con.prepareStatement("update alumno set direccion=?, fechanac=? where idalumno =?");
				pst.setString(1,a.getDireccion());
				pst.setDate(2,Validarfunciones.convierteFecha(a.getFechaNac()));
				pst.setInt(3, a.getIdAlumno());
				pst.execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				Conexion.cierraConexion();
			}

		}
	}