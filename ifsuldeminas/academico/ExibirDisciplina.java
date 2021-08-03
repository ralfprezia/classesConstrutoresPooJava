package ifsuldeminas.academico;

public class ExibirDisciplina {

	public static void main(String[] args) {
		Disciplina matematica = new Disciplina("Matemática", 3, 3, 0, 4, "Ralf Prezia");
		int numSemanas = 0;
		int numAulasSemana = 0;
		int numTotalAulas = numAulasSemana * numSemanas;
		System.out.println("\n===============================\n");
		System.out.println("Dados da Dsiciplina");
		System.out.println("Matéria: " + matematica.nome);
		System.out.println(matematica.periodo + "° Período");
		System.out.println("Semanas: " + matematica.numSemanas);
		System.out.println("Aulas na Semana: " + matematica.numAulasSemana);
		System.out.println("Total de Aulas: " + matematica.numTotalAulas);
		System.out.println("Professor: " + matematica.nomeProfessor);
		System.out.println("\n===============================\n");

	}

}
