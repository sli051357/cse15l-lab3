import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseInPlaceActual() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
  }

  @Test 
  public void testReversedActual() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  /**
   * Tests averageWithoutLowest() when the input is less than 2
   */
  @Test 
  public void testAverageWithoutLowestSmall() {
    double[] input1 = {};
    double[] input2 = {1.0};

    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  /**
   * Tests averageWithoutLowest() with a larger input array
   */
  @Test 
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] input2 = {2.0, 0.0, 3.0, 5.0, 4.0};

    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input2), 0.0);
  }
}
