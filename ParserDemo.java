public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\Users\\samar\\Desktop\\CS361\\Compiler\\Team_11_Scanner_and_Parser\\prog1.jay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}