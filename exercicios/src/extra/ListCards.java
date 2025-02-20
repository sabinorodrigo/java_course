package extra;

import java.util.Arrays;
import java.util.List;

public class ListCards {

	public static void main(String[] args) {
		
		Cards celticGuardian = new Cards("Celtic Guardian", 1400, 1200);
		Cards summonedSkull = new Cards("Summoned Skull", 2500, 1200);
		Cards darkMagician = new Cards("Dark Magician", 2500, 2100);
		
		List<Cards> cardsName = Arrays.asList(celticGuardian, summonedSkull, darkMagician);
		
		System.out.println("For each: #01");
		for (Cards card : cardsName) {
			System.out.println(card);
		}
		
		System.out.println("For each: #02");
		cardsName.forEach(System.out::println);
		
		
		
	}
}
