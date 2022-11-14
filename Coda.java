package com.adecco.coda;

import java.util.ArrayList;

import com.adecco.persona.Persona;

public class Coda {
	/*
	 * PRIMA RICHEISTA DEL TESTO (CODA)
	 * 
	 * un metodo pubblico 
	 * aggiungi persona 
	 * che permette di inserie una persona
	 *  in fondo alla coda 
	 * la persona deve essere in ultima posizione
	 * nella coda 
	 * 
	 */
	
//---PER PRIMA COSA INSERIAMO LA LISTA DELLE PERSONE ATTREVRSO IL ARRAYLIST
//   POUCHE NESSUNO DEVE SAPERE CHI C'è QUESTA LISTA DEVE ESERE PRIVATA 
	
	private ArrayList<Persona>persone; 
	// dichiatriamo che questa lista fa par parte della coda 
	
	public Coda() {
		this.persone=new ArrayList<>();
	}
	//le persone vengono registrate attravreso il get ( devono essere estrapolate dalla lista 9
	public ArrayList<Persona>getpersone(){
		return persone;	
	}
//---ANDIAMO A STAMPARE QUESTE PERSONE UTILIZZANdo IL NUOVO OGGETO STAMPAPERSONE 
	 public void stampPersone() {
		 
		 for(Persona p1 : persone)
			 System.out.println(p1);// dichiamiamo di prendere una persona all'interno della classe perosna , oppure di stampare tutti le persone 	
	}
	 
	 /*
	  *SECONDA RICHIESTA DEL TESTO 
	  * 
	  * Un metodo pubblico "restituisciProssimo" 
	  * deve per prima cosa eleiminare la persona della coda 
	  * per poi aggiungerla come primo posto 
	  * 
	  */
	 
//---ALL'INTERNO DELLA CLASSE CODA , ANDIAMO A CREARE L'OGGETTO RESTITUISCIPERSONE CHE ANDRA A LAVOARE ALL'INTERNOD DELLA CLASSE PERSONA 
	
	 
	 
	 
	
}
