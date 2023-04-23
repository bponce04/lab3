import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceTwo() {
    int[] input2 = {3,2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {1,2,3}, input2);

  }

  @Test
  public void testReversed() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));

  }

  @Test
  public void testReversedTwo() {

    int[] input2 = {15,10,5};
    assertArrayEquals(new int[]{5,10,15}, ArrayExamples.reversed(input2));

  }
}
