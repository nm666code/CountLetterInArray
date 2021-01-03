
public class CountLettersInArray {

	public static void main(String[] args) {
		char[] chars = new char[100];
		for (int i = 0; i < chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
			System.out.println( (char)(i + 'a') + ": " + (counts[i])+" ");
			else
			System.out.print( (char)(i + 'a') + ": " + (counts[i])+" ");
			}
	}

}
