import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testing_incrementVar() {
		Main obj = new Main();
		int var = 4;
		obj.incrementVar(var);
		assertEquals(4, var);
	}

	@Test
	public void testing_incrementArr() {
		Main obj = new Main();
		int[] arr = {3, 3, 3};
		obj.incrementArr(arr);
		assertEquals(4, arr[0]);
	}

	@Test
	public void testing_incrementObj() {
		Main obj = new Main();
		Dog dog = new Dog();
		dog.age = 4;
		obj.incrementObj(dog);
		assertEquals(5, dog.age);
	}

	@Test
	public void testing_incrementVar2() {
		Main obj = new Main();
		int var = 7;
		obj.incrementVar(var);
		assertEquals(7, var);
	}

	@Test
	public void testing_incrementArr2() {
		Main obj = new Main();
		int[] arr = {7, 7, 7};
		obj.incrementArr(arr);
		assertEquals(8, arr[0]);
	}

	@Test
	public void testing_incrementObj2() {
		Main obj = new Main();
		Dog dog = new Dog();
		dog.age = 7;
		obj.incrementObj(dog);
		assertEquals(8, dog.age);
	}
}