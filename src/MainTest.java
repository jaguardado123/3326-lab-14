import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testing_incrementVar() {
		int x = 0;
		Main.incrementVar(x);
		assertEquals(0, x);
	}

	@Test
	public void testing_incrementArr() {
		int []x = {2, 4, 6};
		int []y = {3, 6, 9, 12, 15};
		Main.incrementArr(x);
		Main.incrementArr(y);
		assertArrayEquals(new int[]{3, 5, 7}, x);
		assertArrayEquals(new int[]{4, 7, 10, 13, 16}, x);
	}

	@Test
	public void testing_incrementObj() {
		Dog x = new Dog();
		Main.incrementObj(x);
		assertEquals(1, x.age);
		Main.incrementObj(x);
		assertEquals(2, x.age);
	}
}