package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(7 / sc.nextInt());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally #01...");
		}
		
		try {
			System.out.println(7 / sc.nextInt());
		} finally {
			System.out.println("Finally #02...");
			sc.close();
		}
		
		System.out.println("Fim!");
	}
}
