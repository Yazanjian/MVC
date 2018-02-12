import static org.junit.Assert.*;
import org.junit.Test;

public class testing {
	ModelClass model=new ModelClass();
	double x=5;
	@Test
	public void test() {
		assertEquals( x, model.add(1,4) ,0.00001);
	}

}
