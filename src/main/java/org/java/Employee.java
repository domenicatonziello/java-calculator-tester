package org.java;

import java.time.LocalDate;

public class Employee {
	
	private String nome;
	private String cognome;
	private LocalDate birthdate;
	private String ruolo;
	
	public Employee(String nome, String cognome,LocalDate birthdate,String ruolo)throws Exception {
		
		setNome(nome);
		setCognome(cognome);
		setBirthdate(birthdate);
		setRuolo(ruolo);
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		int strLen = nome.length(); 
		if(strLen <= 0) {
			throw new Exception("il nome non può essere nullo");
		}
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) throws Exception {
		int strLen = cognome.length(); 
		if(strLen <= 0) {
			throw new Exception("il cognome non può essere nullo");
		}
		this.cognome = cognome;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) throws Exception {
		LocalDate nowDate = LocalDate.now(); 
		if(nowDate.isBefore(birthdate)) {
			throw new Exception("La data di nascita non può essere nel futuro");
		}
		this.birthdate = birthdate;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) throws Exception {
		if(!ruolo.toLowerCase().equals("employee") && !ruolo.toLowerCase().equals("boss")) {
			throw new Exception("il ruolo deve essere uguale a : Employee / Boss ");
		}
		this.ruolo = ruolo;
	}
	
	
	

}
