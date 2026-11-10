
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "C:\\Users\\samar\\Desktop\\CS361\\Compiler\\Team_11_Scanner_and_Parser\\prog1.jay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			// TO BE COMPLETE
			Token tmp = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tmp.getType() + " - Value: " + tmp.getValue());
		}
	}
}
