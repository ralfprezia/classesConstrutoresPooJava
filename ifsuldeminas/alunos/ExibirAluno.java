package ifsuldeminas.alunos;

public class ExibirAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ralf Prezia",1001, "Técnico em Desenvolvimento de sistemas");
		
		System.out.println("\n===============================\n");
		System.out.println("Dados do Aluno");
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("RA: " + aluno1.ra);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println("\n===============================\n");
		
		Aluno aluno2 = new Aluno("Maria Cecillia",9999, 1, "Técnico em Desenvolvimento de sistemas");
		
		System.out.println("\n===============================\n");
		System.out.println("Dados do Aluno");
		System.out.println("Nome: " + aluno2.nome);
		System.out.println("RA: " + aluno2.ra);
		System.out.println("Periodo = " + aluno2.periodo);
		System.out.println("Curso: " + aluno2.curso);
		System.out.println("\n===============================\n");
	}
}
