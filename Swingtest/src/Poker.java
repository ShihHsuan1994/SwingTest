

public class Poker{

	int i; //
	
	public Poker() {
		
	}
	
	public String pokerRandom() {
	
		String pokertype[] = {"黑桃","紅心","菱形","梅花"};
		int T = (int)(Math.random()*4);
		i = (int)(Math.random()*12+1);				
		return pokertype[T] +i;
		
		
	}
	
	
}