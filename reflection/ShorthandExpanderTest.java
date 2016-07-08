package reflection;

/*static import allows for unqualified calls to static methods*/
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShorthandExpanderTest {
	@Test
	public void with() {
		String input = "This is a test w/, \"w/\"";
		String result = ShorthandExpander.repWith(input);
		assertEquals("This is a test with, \"with\"", result);
	}
}