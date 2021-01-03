import java.security.SecureRandom;
import java.util.Random;
public class RandomCharacter {
	public static char getRandomLowerCaseLetter() {
		Random random = new Random();
		return (char)('a'+random.nextInt(26));
	}
}
