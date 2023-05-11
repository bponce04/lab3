import static org.junit.Assert.*;

import java.lang.reflect.Array;

import javax.xml.namespace.QName;

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
  @Test
  public void testAverageWithoutLowest() {

    double[] input1 = {1.0,0.0,1.0,0.0};
    Assert.assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),1.0);

  }
  @Test
  public void testAverageWithoutLowestTwo() {

    double[] input2 = {1.0,-2.0,3.0,-4.0};
    Assert.assertEquals(1.0,ArrayExamples.averageWithoutLowest(input2),1.5);
  }

  @Test
  public void testAverageWithoutLowestThree() {

    double[] input3 = {};
    Assert.assertEquals(0.0,ArrayExamples.averageWithoutLowest(input3),0.0);

  }
  @Test
  public void testAverageWithoutLowestFour() {

    double[] input4 = {1.0};
    Assert.assertEquals(0.5,ArrayExamples.averageWithoutLowest(input4),1.5);

  }
}

