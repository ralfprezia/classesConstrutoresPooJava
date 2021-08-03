package ifsuldeminas.academico;

public class Disciplina {
	
	public String nome;
	public int periodo;
	public int numSemanas;
	public int numAulasSemana;
	public int numTotalAulas;
	public String nomeProfessor;
	
	public Disciplina(String nome, int periodo, int numAulasSemana, int numTotalAulas, int numSemanas, String nomeProfessor) {
		this.nome = nome;
		this.periodo = periodo;
		this.numAulasSemana = numAulasSemana;
		this.numTotalAulas = numAulasSemana * numSemanas;
		this.numSemanas = numSemanas;
		this.nomeProfessor = nomeProfessor;
	}

	
}
