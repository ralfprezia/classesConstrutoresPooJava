package ifsuldeminas.main;

import java.util.Scanner;

import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.alunos.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Disciplina musica = new Disciplina("M�sica", 1, 3, 1, 0, "Ralf Prezia");

		Professor ralfPrezia = new Professor("Ralf Prezia", 9876, "M�sica", 1);
		
		Aluno aluno1 = new Aluno("Clarice Silva",1001, 1,"M�sica");
		
		Aluno aluno2 = new Aluno("Maria Cecillia",9999, 1, "M�sica");
		
		Aluno aluno3 = new Aluno("Fernanda Lima",6363, 1,"T�cnico em Desenvolvimento de sistemas");
		
		Aluno aluno4 = new Aluno("Maria Madalena",1234, 1, "Curso de M�sica");
		
		Aluno aluno5 = new Aluno("Cezar O Grande",7081, 1,"Curso de M�sica");
		
		Aluno aluno6 = new Aluno("Hebert Vianna",2221, 1, "Curso de M�sica");
		
		Aluno aluno7 = new Aluno("Renato Arag�o",1010, 1,"Curso de M�sica");
		
		Aluno aluno8 = new Aluno("Marcia Fernandes",4444, 1, "Curso de M�sica");
		
		Aluno aluno9 = new Aluno("Chico Xavier",8888, 1,"Curso de M�sica");
		
		Aluno aluno10 = new Aluno("Edson Arantes do Nascimento",1111, 1, "Curso de M�sica");
		
		int resposta = 0, repeteMenu = 1;
		
		while(repeteMenu != 0) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("1 - Imprimir informa��es de um aluno");
			System.out.println("2 - Imprimir informa��es da disciplina");
			System.out.println("3 - Imprimir o professor respons�vel");
			System.out.println("0 - Fechar o programa");
			int opcao = scan.nextInt();
			
			switch(opcao) {
				case 1 : {
					Scanner scan1 = new Scanner(System.in);
					System.out.println("Digite o n�mero do aluno para imprimir as informa��es.\n");
					System.out.println("11 - Clarice Silva");
					System.out.println("12 - Maria Cecillia");
					System.out.println("13 - Fernanda Lima");
					System.out.println("14 - Maria Madalena");
					System.out.println("15 - Cezar O Grande");
					System.out.println("16 - Hebert Vianna");
					System.out.println("17 - Renato Arag�o");
					System.out.println("18 - Marcia Fernandes");
					System.out.println("19 - Chico Xavier");
					System.out.println("20 - Edson Arantes do Nascimento");
					System.out.println("00 - Sair.");
					int opcao1 = scan1.nextInt();
						switch(opcao1) {
							case 11 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno1.nome);
							System.out.println("Matr�cula: " + aluno1.ra);
							System.out.println(aluno1.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno1.curso);
							break;
							}
							case 12 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno2.nome);
							System.out.println("Matr�cula: " + aluno2.ra);
							System.out.println(aluno2.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno2.curso);
							break;
							}
							case 13 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno3.nome);
							System.out.println("Matr�cula: " + aluno3.ra);
							System.out.println(aluno3.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno3.curso);
							break;
							}
							case 14 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno4.nome);
							System.out.println("Matr�cula: " + aluno4.ra);
							System.out.println(aluno4.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno4.curso);
							break;
							}
							case 15 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno5.nome);
							System.out.println("Matr�cula: " + aluno5.ra);
							System.out.println(aluno5.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno5.curso);
							break;
							}
							case 16 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno6.nome);
							System.out.println("Matr�cula: " + aluno6.ra);
							System.out.println(aluno6.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno6.curso);
							break;
							}
							case 17 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno7.nome);
							System.out.println("Matr�cula: " + aluno7.ra);
							System.out.println(aluno7.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno7.curso);
							break;
							}
							case 18 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno8.nome);
							System.out.println("Matr�cula: " + aluno8.ra);
							System.out.println(aluno8.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno8.curso);
							break;
							}
							case 19 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno9.nome);
							System.out.println("Matr�cula: " + aluno9.ra);
							System.out.println(aluno9.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno9.curso);
							break;
							}
							case 20 : {
							System.out.println("Nome do aluno(a):"); 
							System.out.println(aluno10.nome);
							System.out.println("Matr�cula: " + aluno10.ra);
							System.out.println(aluno10.periodo + "� Per�odo.");
							System.out.println("Mat�ria: " + aluno10.curso);
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
					System.out.println("Mat�ria: " + musica.nome);
					System.out.println(musica.periodo + "� Per�odo");
					System.out.println("Aulas na Semana: " + musica.numAulasSemana);
					System.out.println("Professor: " + musica.nomeProfessor);
					System.out.println("\n===============================\n");
					repeteMenu = 2;
					break;	
				}
				
				case 3 : {
					System.out.println("\n===============================\n");
					System.out.println("Professor respons�vel:");
					System.out.println("Nome: " + ralfPrezia.nome);
					System.out.println("Registro n�: " + ralfPrezia.suap);
					System.out.println("Mat�ria: " + ralfPrezia.materia);
					System.out.println(ralfPrezia.periodo + "� Per�odo");
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
					System.out.println("Digite um comando v�lido!");
					break;
				}
				
			}
			
		}
	}
}
