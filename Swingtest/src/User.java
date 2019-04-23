import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		
		Poker poker = new Poker(); 
		
		System.out.println("請輸入發牌人數： ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		for(int A = 1 ; A <= input; A++) {
			
			poker.pokerRandom();
		}
		
		
	
	}
	
	
}
