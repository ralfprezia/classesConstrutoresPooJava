package ifsuldeminas.main;

import java.util.Scanner;

import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.alunos.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Disciplina musica = new Disciplina("Música", 1, 3, 1, 0, "Ralf Prezia");

		Professor ralfPrezia = new Professor("Ralf Prezia", 9876, "Música", 1);
		
		Aluno aluno1 = new Aluno("Clarice Silva",1001, 1,"Música");
		
		Aluno aluno2 = new Aluno("Maria Cecillia",9999, 1, "Música");
		
		Aluno aluno3 = new Aluno("Fernanda Lima",6363, 1,"Técnico em Desenvolvimento de sistemas");
		
		Aluno aluno4 = new Aluno("Maria Madalena",1234, 1, "Curso de Música");
		
		Aluno aluno5 = new Aluno("Cezar O Grande",7081, 1,"Curso de Música");
		
		Aluno aluno6 = new Aluno("Hebert Vianna",2221, 1, "Curso de Música");
		
		Aluno aluno7 = new Aluno("Renato Aragão",1010, 1,"Curso de Música");
		
		Aluno aluno8 = new Aluno("Marcia Fernandes",4444, 1, "Curso de Música");
		
		Aluno aluno9 = new Aluno("Chico Xavier",8888, 1,"Curso de Música");
		
		Aluno aluno10 = new Aluno("Edson Arantes do Nascimento",1111, 1, "Curso de Música");
		
		int resposta = 0, repeteMenu = 1;
		
		while(repeteMenu != 0) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("1 - Imprimir informações de um aluno");
			System.out.println("2 - Imprimir informações da disciplina");
			System.out.println("3 - Imprimir o professor responsável");
			System.out.println("0 - Fechar o programa");
			int opcao = scan.nextInt();
			
			switch(opcao) {
				case 1 : {
					Scanner scan1 = new Scanner(System.in);
					System.out.println("Digite o número do aluno para imprimir as informações.\n");
					System.out.println("11 - Clarice Silva");
					System.out.println("12 - Maria Cecillia");
					System.out.println("13 - Fernanda Lima");
					System.out.println("14 - Maria Madalena");
					System.out.println("15 - Cezar O Grande");
					System.out.println("16 - Hebert Vianna");
					System.out.println("17 - Renato Aragão");
					System.out.println("18 - Marcia Fernandes");
					System.out.println("19 - Chico Xavier");
					System.out.println("20 - Edson Arantes do Nascimento");
					System.out.println("00 - Sair.");
					int opcao1 = scan1.nextInt();
						switch(opcao1) {
							case 11 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno1.nome);
							System.out.println("Matrícula: " + aluno1.ra);
							System.out.println(aluno1.periodo + "° Período.");
							System.out.println("Matéria: " + aluno1.curso);
							break;
							}
							case 12 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno2.nome);
							System.out.println("Matrícula: " + aluno2.ra);
							System.out.println(aluno2.periodo + "° Período.");
							System.out.println("Matéria: " + aluno2.curso);
							break;
							}
							case 13 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno3.nome);
							System.out.println("Matrícula: " + aluno3.ra);
							System.out.println(aluno3.periodo + "° Período.");
							System.out.println("Matéria: " + aluno3.curso);
							break;
							}
							case 14 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno4.nome);
							System.out.println("Matrícula: " + aluno4.ra);
							System.out.println(aluno4.periodo + "° Período.");
							System.out.println("Matéria: " + aluno4.curso);
							break;
							}
							case 15 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno5.nome);
							System.out.println("Matrícula: " + aluno5.ra);
							System.out.println(aluno5.periodo + "° Período.");
							System.out.println("Matéria: " + aluno5.curso);
							break;
							}
							case 16 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno6.nome);
							System.out.println("Matrícula: " + aluno6.ra);
							System.out.println(aluno6.periodo + "° Período.");
							System.out.println("Matéria: " + aluno6.curso);
							break;
							}
							case 17 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno7.nome);
							System.out.println("Matrícula: " + aluno7.ra);
							System.out.println(aluno7.periodo + "° Período.");
							System.out.println("Matéria: " + aluno7.curso);
							break;
							}
							case 18 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno8.nome);
							System.out.println("Matrícula: " + aluno8.ra);
							System.out.println(aluno8.periodo + "° Período.");
							System.out.println("Matéria: " + aluno8.curso);
							break;
							}
							case 19 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno9.nome);
							System.out.println("Matrícula: " + aluno9.ra);
							System.out.println(aluno9.periodo + "° Período.");
							System.out.println("Matéria: " + aluno9.curso);
							break;
							}
							case 20 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno10.nome);
							System.out.println("Matrícula: " + aluno10.ra);
							System.out.println(aluno10.periodo + "° Período.");
							System.out.println("Matéria: " + aluno10.curso);
							break;
							}
							case 00 : {
								System.out.println("Saindo para menu principal.");
							}		
						}
					repeteMenu = 1;
					break;
				}
				case 2 : {
					System.out.println("\n===============================\n");
					System.out.println("Dados da Dsiciplina");
					System.out.println("Matéria: " + musica.nome);
					System.out.println(musica.periodo + "° Período");
					System.out.println("Aulas na Semana: " + musica.numAulasSemana);
					System.out.println("Professor: " + musica.nomeProfessor);
					System.out.println("\n===============================\n");
					repeteMenu = 2;
					break;	
				}
				
				case 3 : {
					System.out.println("\n===============================\n");
					System.out.println("Professor responsável:");
					System.out.println("Nome: " + ralfPrezia.nome);
					System.out.println("Registro n°: " + ralfPrezia.suap);
					System.out.println("Matéria: " + ralfPrezia.materia);
					System.out.println(ralfPrezia.periodo + "° Período");
					System.out.println("\n===============================\n");
					repeteMenu = 3;
					break;
				}
				
				case 0 : {
					System.out.println("O programa foi encerrado!");
					repeteMenu = 0 ;
					break;
				}
		
				default : {
					System.out.println("Digite um comando válido!");
					break;
				}
				
			}
			
		}
	}
}
