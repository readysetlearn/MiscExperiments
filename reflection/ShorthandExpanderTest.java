package reflection;

/*static import allows for unqualified calls to static methods*/
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.reflect.*;

public class ShorthandExpanderTest {
	@Test
	public void with() {
		String input = "This is a test w/, \"w/\"";
		
		try {
			
			/*Use reflection*/
			Method meth = ShorthandExpander.class.getDeclaredMethod("repWith", String.class);
			meth.setAccessible(true);
			Object obj = meth.invoke(null, input);
			String result = (String)obj;
			System.out.println("This is result: "+result);
			assertEquals("This is a test with, \"with\"", result);
			
		} catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			
			e.printStackTrace();
			
		}
		

	}
}