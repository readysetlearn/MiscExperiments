package reflection;

public class ShorthandExpander {
    public static String expandSentence(String sentence) {
		return(repWith(repBecause(repBlackAndWhite(sentence))));
	}
	
	//replace w/ with "with"
	private static String repWith(String sentence) {
		return sentence.replaceAll("w/", "with");
	}
	
	//replace b/c with "because"
	private static String repBecause(String sentence) {
		return sentence.replaceAll("b/c", "because");
	}
	
	//replace b&w with "black and white"
	private static String repBlackAndWhite(String sentence) {
		return sentence.replaceAll("b&w", "black and white");
	}
}
