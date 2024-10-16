package media;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x, y, z, media;
		
		System.out.print("Digite sua primeira nota: ");
		x = sc.nextFloat();
		
		System.out.print("Digite sua segunda nota: ");
		y = sc.nextFloat();
		
		System.out.print("Digite sua terceira nota: ");
		z = sc.nextFloat();
		
		media = (x + y + z) / 3;
		
		System.out.printf("Sua média é: %.2f%n", media);
		
		sc.close();
		
	}
}
