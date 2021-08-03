package ifsuldeminas.alunos;

public class Aluno {
	public static char[] aluno1;
	public String nome;
	public int ra;
	public int periodo;
	public String curso;
	
	public Aluno(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
		
	}
	
	public Aluno(String nome, int ra, int periodo, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.periodo = periodo;
		this.curso = curso;
	}
}
