package com.adecco.test;

import static org.junit.Assert.*;

import com.adecco.persona.Persona;
// ANIDIAMO A FARE IL TEST DELLA CLASSE pERSONA
public class Test {

	@org.junit.Test
	public void testPersona() {
		// RIPRENDIMAO LA CLASSE PERSONA 
		Persona persona=new Persona("Rega",27);
		
		//INSERIAMO LA PERONSA CON "assertEquals" ALL'INTERNO DEL NOSTRO TEST
		//--->inseriamo il cognome
		System.out.println(persona);
		assertEquals(persona.getCognome(),"Rega"); 
		//--->inseriamo l'eta del nostra persona , dichiaradno se è vera 
		assertTrue(persona.getEta()== 27); 
		
		assertFalse(persona.getEta() > 30);
		
		
		
		
		
	}

}
