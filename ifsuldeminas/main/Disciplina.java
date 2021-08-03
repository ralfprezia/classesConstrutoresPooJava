package ifsuldeminas.main;

public class Disciplina {
	public String nome;
	public int periodo;
	public int numAulasSemana;
	public String nomeProfessor;
	
	public Disciplina(String nome, int periodo, int numSemanas, String nomeProfessor) {
		this.nome = nome;
		this.periodo = periodo;
		this.numAulasSemana = numAulasSemana;
		this.nomeProfessor = nomeProfessor;
	}

}
