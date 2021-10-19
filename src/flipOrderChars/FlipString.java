/**
 * 
 */
package flipOrderChars;

/**
 * @author NathanClarke
 *
 */
public class FlipString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Each 10,000 mile journey begins with just one step.";
		
		StringBuilder b = new StringBuilder(s);
		
		String ans = b.reverse().toString();
		
		System.out.println(ans);

	}

}
