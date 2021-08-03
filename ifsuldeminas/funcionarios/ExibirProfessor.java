package ifsuldeminas.funcionarios;

public class ExibirProfessor {

	public static void main(String[] args) {
		Professor professor1 = new Professor("Ralf Prezia", 3333);

		System.out.println("\n===============================\n");
		System.out.println("Dados do Professor");
		System.out.println("Nome: " + professor1.nome);
		System.out.println("SUAP: " + professor1.suap);
		System.out.println("\n===============================\n");

	}

}
