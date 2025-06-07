package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * Return system date and time
	 */
	public String getSystemTime() {
		
		return  LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * @return random number
	 */
	public void generateRandomNumber() {
		Random ran= new Random();
		ran.nextInt(1000);
	}

}
