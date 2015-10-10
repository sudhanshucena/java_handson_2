package hands_on_2;

import java.util.Random;

public class Bruce extends luck{
	Random random = new Random();
	long randomNumber;
	@Override
	public long generateRandomNumber() {
		randomNumber = random.nextLong();
		return randomNumber;
	}

}
