package BlackBox;

import BlackBox.Setups.SortSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortAlgorithmBlackBoxTest extends SortSetup {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
       return Arrays.asList(new Object[][]{
        {new int[] {1,3,2}, new int[]{1,2,3}},
        {new int[] {3,2,1}, new int[]{1,2,3}},
        {new int[] {1,2,3}, new int[]{1,2,3}},
        {new int[] {1,1,1}, new int[]{1,1,1}},
        {new int[] {-2, -2, 8, 8, 8, 7, 6, -1, 4, 5, 1, -1, 4, 4, 4, 4, 4, 3, 2, 1, -1, -1}, new int[]{-2, -2, -1, -1, -1, -1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8}},
        {new int[] {1}, new int[]{1}},
        {new int[] {}, new int[]{}},
        });
    }
    private final int[] actual;
    private final int[] expected;

    public SortAlgorithmBlackBoxTest(int[] actual, int[] expected){
        this.actual=actual;
        this.expected=expected;
    }
    @Test
    public void testSort(){
        sortAlgorithmPUT.run(actual,expected);
    }

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        int[] input = new int[]{1,2,3};
        int[] expectedOutput = new int[]{1,2,3};
        sortAlgorithmPUT.run(input,expectedOutput); //where
    }
    //Repeated elements, Max/Min integers, Empty, Null etc
    //@TODO: Create more tests

    @Test
    public void duplicateTest(){

        int[] input = new int[]{2,2,1,1,3,4};
        int[] expectedOutput = new int[]{1,1,2,2,3,4};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void emptyTest(){

        int[] input = new int[]{};
        int[] expectedOutput = new int[]{};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void emptyTest2(){

        int[] input = new int[]{0};
        int[] expectedOutput = new int[]{0};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void nullTest(){
        int[] input = null;
        //input.add(null);
        int[] expectedOutput = null;
        //expectedOutput;
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void negativeTest(){

        int[] input = new int[]{-2,2,1};
        int[] expectedOutput = new int[]{-2,1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void allDuplicateTest(){

        int[] input = new int[]{2,2,2,2,2,2};
        int[] expectedOutput = new int[]{2,2,2,2,2,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void extremeTest(){

        int[] input = new int[]{Integer.MAX_VALUE,2,1,-1};
        int[] expectedOutput = new int[]{-1,1,2,Integer.MAX_VALUE};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void extremeTest2(){

        int[] input = new int[]{5,2,1,Integer.MIN_VALUE};
        int[] expectedOutput = new int[]{Integer.MIN_VALUE,1,2,5};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void findNextTest(){

        int[] input = new int[]{-2,1,-1,-2,1,-3,3,4};
        int[] expectedOutput = new int[]{-3,-2,-2,-1,1,1,3,4};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void findPrevTest(){

        int[] input = new int[]{2,1,1,-2,1,-3,3,-4};
        int[] expectedOutput = new int[]{-4,-3,-2,1,1,1,2,3};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void findJustNextTest(){

        int[] input = new int[]{3,2,1,1,1,-3};
        int[] expectedOutput = new int[]{-3,1,1,1,2,3};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void findNextTest2(){

        int[] input = new int[]{9,8, 7, 6, 5, 1, -1, 4, 3, 2, 1};
        int[] expectedOutput = new int[]{-1, 1, 1, 2, 3, 4, 5, 6, 7, 8,9};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void descendingTest(){

        int[] input = new int[]{7,6,5,4,3};
        int[] expectedOutput = new int[]{3,4,5,6,7};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void oneTest(){

        int[] input = new int[]{7};
        int[] expectedOutput = new int[]{7};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void newTest() {
        int[] input = new int[]{-2, -2, 8, 8, 8, 7, 6, -1, 4, 5, 1, -1, 4, 4, 4, 4, 4, 3, 2, 1, -1, -1};
        int[] expectedOutput = new int[] {-2, -2, -1, -1, -1, -1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
}
