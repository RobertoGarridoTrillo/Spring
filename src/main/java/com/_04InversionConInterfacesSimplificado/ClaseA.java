package com._04InversionConInterfacesSimplificado;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class ClaseA
{
	public static void main (String [] args)
	{
		// creacion de objetos de tipo claseB
		ClaseB claseB = new ClaseB ();

		// uso de los objetos creados
		System.out.println(claseB.getInterfaceB());
	}
}
