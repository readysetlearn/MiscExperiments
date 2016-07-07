package reflection;

public class TestClass {


    public static void main(String[] args) {
        System.out.println("Program started.");
		String exampleSentence = "Remeber to take pills w/ water b/c they may cause dry throat w/ out it.";
		System.out.println(ShorthandExpander.expandSentence(exampleSentence));
		System.out.println("Program finished.");
    }
    
}
