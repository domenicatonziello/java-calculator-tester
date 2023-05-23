package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.java.Employee;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	 @Test
	    public void EmploTest() throws Exception {
	        String nome = "Alessio";
	        String cognome = "Verdi";
	        LocalDate birthdate = LocalDate.of(2000, 10, 10);
	        String ruolo = "boss";
	        
	        Employee employee = new Employee(nome, cognome, birthdate, ruolo);
	        
	        assertEquals(nome, employee.getNome());
	        assertEquals(cognome, employee.getCognome());
	        assertEquals(birthdate, employee.getBirthdate());
	        assertEquals(ruolo, employee.getRuolo());
	    }
	 @Test
	 	public void nomeEmpty() throws Exception {
		 String nome = "";
	     String cognome = "Verdi";
	     LocalDate birthdate = LocalDate.of(2000, 10, 10);
	     String ruolo = "boss";
	     
	     Employee employee = new Employee(nome, cognome, birthdate, ruolo);
	        
	     assertEquals(nome, employee.getNome());
	     assertEquals(cognome, employee.getCognome());
	     assertEquals(birthdate, employee.getBirthdate());
	     assertEquals(ruolo, employee.getRuolo());
		 
	 }
	 @Test
	 	public void cognomeEmpty() throws Exception {
		 String nome = "Ale";
	     String cognome = "";
	     LocalDate birthdate = LocalDate.of(2000, 10, 10);
	     String ruolo = "boss";
	     
	     Employee employee = new Employee(nome, cognome, birthdate, ruolo);
	        
	     assertEquals(nome, employee.getNome());
	     assertEquals(cognome, employee.getCognome());
	     assertEquals(birthdate, employee.getBirthdate());
	     assertEquals(ruolo, employee.getRuolo());
		 
	 }
	 @Test
	 	public void dateTest() throws Exception {
		 String nome = "Ale";
	     String cognome = "Rossi";
	     LocalDate birthdate = LocalDate.of(2025, 10, 10);
	     String ruolo = "boss";
	     
	     Employee employee = new Employee(nome, cognome, birthdate, ruolo);
	        
	     assertEquals(nome, employee.getNome());
	     assertEquals(cognome, employee.getCognome());
	     assertEquals(birthdate, employee.getBirthdate());
	     assertEquals(ruolo, employee.getRuolo());
		 
	 }
	 @Test
	 	public void ruoloTest() throws Exception {
		 String nome = "Ale";
	     String cognome = "Rossi";
	     LocalDate birthdate = LocalDate.of(2000, 10, 10);
	     String ruolo = "teach";
	     
	     Employee employee = new Employee(nome, cognome, birthdate, ruolo);
	        
	     assertEquals(nome, employee.getNome());
	     assertEquals(cognome, employee.getCognome());
	     assertEquals(birthdate, employee.getBirthdate());
	     assertEquals(ruolo, employee.getRuolo());
		 
	 }
	 

}
