package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		System.out.println("ALUNO A: ");
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[2] = 9.5;

		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("MEDIA ALUNO A: ");
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		System.out.println("ALUNO B: ");
		double[] notasAlunoB = { 6.9, 8,9, 5.5, 10.0 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println(notasAlunoB[i]);
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("MEDIA ALUNO B: ");
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		System.out.println("ALUNO C: ");
		double[] notasAlunoC = new double[] { 9.8, 5.9, 8.7, 6.7 };
		
		double totalAlunoC = 0.0;
		for (int i = 0; i < notasAlunoC.length; i++) {
			System.out.println(notasAlunoC[i]);
			totalAlunoC += notasAlunoC[i];
		}
		System.out.println("MEDIA ALUNO C: ");
		System.out.println(totalAlunoC / notasAlunoC.length);
	}
	
}
