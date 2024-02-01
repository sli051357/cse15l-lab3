import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    List<String> input1 = new ArrayList<String>();
    List<String> input2 = new ArrayList<String>();
    List<String> input3 = new ArrayList<String>();
    StringChecker sc = new MyStringChecker();
    List<String> expected1 = new ArrayList<String>();
    List<String> expected2 = new ArrayList<String>();

    @Before 
    public void initialize() {
        input1.add("Hello");
        input1.add("World");
        input1.add("Boo");
        input1.add("Ahh");
        input1.add("Yippee");
        input1.add("Halloooo");

        expected1.add("Yippee");
        expected1.add("Halloooo");

        input2.add("a");
        //input2.add("hello");
        input2.add("b");

        input3.add("c");
        input3.add("d");
        input3.add("e");

        expected2.add("a");
        expected2.add("b");
        expected2.add("c");
        //expected2.add("hello");
        expected2.add("d");
        expected2.add("e");
    }

    @Test 
    public void testFilter() {
        assertEquals(ListExamples.filter(input1, sc), expected1);
    }

    @Test 
    public void testMerge() {
        assertEquals(ListExamples.merge(input2, input3), expected2);
    }
}
