package Aula03;

import java.util.Objects;

public class Exer3 {
public static void main(String[] args) {
		String aluno1 = "Fernanda Felix";
		String aluno2 = "Ana Beatriz";
		String aluno3 = "Felipe Serikyaku";
		String aluno4 = "Domingos Bernardo";
		
		System.out.println( Objects.equals( aluno1, aluno2 ) );
		System.out.println( Objects.equals( aluno1, aluno4 ) );	
		
		System.out.println( Objects.hash( aluno1 ) );		
		System.out.println( Objects.hash( aluno2, aluno3 ) );
		
	}

}