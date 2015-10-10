package hands_on_2;

public class WhoGetsTheGirl {
	public static void main(String args[]){
		Michael michael = new Michael();
		Bruce bruce = new Bruce();
		long michaelNum=michael.generateRandomNumber(),
				bruceNum=bruce.generateRandomNumber();
		System.out.println("Michael Wrote:"+ michaelNum+"\nBruce Wrote:"+ bruceNum);
		System.out.println("The lucky guy is :");
		if(michaelNum < bruceNum)
			System.out.println("Michael");
		else
			System.out.println("Bruce");
//		StringBuffer str = "Hello World";
	}
}
