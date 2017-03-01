/*
 * "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) 
 * they get confusing."
 * Write a function that, given a sentence like the one above, 
 * along with the position of an opening parenthesis, finds the corresponding closing parenthesis.
 * Example: if the example string above is input with the number 10(position of the first parenthesis),
 *  the output should be 79(position of the last parenthesis).
 */
public class Parentheticals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentheticals p = new Parentheticals();
		System.out.println(p.get_Closing_Parenthe_Index("HI(((Hgfjh)))", 3));

	}
	
	int get_Closing_Parenthe_Index(String ipstr,int openingParenthIndex)
	{
		int openParenthesis =0;
		
		for (int position = openingParenthIndex+1;position<ipstr.length();position++) {
			char c = ipstr.charAt(position);
			if(c == '(')
				openParenthesis++;
			else if(c == ')'){
				if(openParenthesis == 0)
					return  position;
				else
					openParenthesis--;
			}
		}
		 throw new IllegalArgumentException("No closing parenthesis :(");
	}
}
