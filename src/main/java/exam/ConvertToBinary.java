
package exam;

public class ConvertToBinary {

	public String toBinary(final int n) {
		// TODO write your code here to achieve the desired result as explained in
		// Readme file for this problem.
		String result = "";
		int num = n;
		while (num > 0) {
			if ((num % 2) == 0)
				result = "0" + result;
			else
				result = "1" + result;
			num = num / 2;
		}
		return result;
	}
}
