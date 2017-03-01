import java.util.HashSet;
import java.util.Set;

/*
 * Write an efficient function that checks whether any permutation of an input string is a
 *  palindrome.
 *  Examples:
 *  "civic" should return True
 *  "ivicc" should return True
 *  "civil" should return False
 *  "livci" should return False
 *  "But 'ivicc' isn't a palindrome!"
*/
public class PermutationIPPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ispalindrome = false;
		PermutationIPPalin p = new PermutationIPPalin();
		ispalindrome = p.has_palindrome_permutation("yre");
		if(ispalindrome == true)
			System.out.println("Any one combination of given input string is Palindrome");
		else
			System.out.println("Any combination of input string is not palindrome");

	}
	boolean has_palindrome_permutation(String IPStr){
		Set<Character> unpairedCharacters = new HashSet<Character>();
		for (Character c : IPStr.toCharArray()) {
			if(unpairedCharacters.contains(c))
				unpairedCharacters.remove(c);
			else 
				unpairedCharacters.add(c);
		}
		if(unpairedCharacters.size()<=1)
			return true;
		else 
			return false;
	}
}
