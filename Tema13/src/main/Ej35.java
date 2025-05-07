package main;

import java.util.Scanner;

import clases.Alumno;
import dao.DaoAlumno;
import util.Validarfunciones;

public class Ej35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = Validarfunciones.dimeString("Dame el nombre de un alumno", sc);
		String apellido = Validarfunciones.dimeString("Dame el apellido de un alumno", sc);
		Alumno alu = DaoAlumno.busca(nombre, apellido);
		//si existe
				if(alu !=null)
				{
					//muestro datos
					System.out.println(alu);
					//pregunto si los cambio
					int opcion = Validarfunciones.dimeEntero("¿Quieres cambiarlos? (1-si, 0-no)",sc);
					if(opcion==1)
					{
						//pido nuevos
						alu.setDireccion(Validarfunciones.dimeString("Nueva dirección", sc));
						alu.setFechaNac(Validarfunciones.dimeFechaDate("Nueva fecha nacimiento", sc));
						DaoAlumno.actualiza(alu);
						System.out.println("Datos actualizados");
					}
				}
				
			}
}
