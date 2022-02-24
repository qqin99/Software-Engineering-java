package BlackBox;

import BlackBox.Setups.LruCacheSetup;
import Utils.LruCacheMethod;
import org.junit.Test;

public class LruCacheBlackBoxTest extends LruCacheSetup {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor, //where is this LruCacheMethod.Constructor
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }

    //cpg cppg cpgg cp

    //@TODO: Create more tests
    @Test
    public void removeTest(){

        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        int[] functionParameters3 = new int[]{2,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        int[] functionParameters4 = new int[]{3,4};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters4,
                null);
        //get key = 1
        int[] functionParameters5 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters5,
                -1);

    }

    @Test
    public void nullTest(){

        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //get key = 1
        int[] functionParameters1 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters1,
                -1);
    }
    //test get key which does not exist
    @Test
    public void notExistKeytest() {
        int[]functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 3
        int[] functionParameters3 = new int[]{3};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                -1);
    }

    @Test
    public void removeOldNodeTest() {

        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);
        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);
        //put key=1, value =3
        int[] functionParameters3 = new int[]{1,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);
        //put key=2, value = 4
        int[] functionParameters4 = new int[]{2,4};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters4,
                null);
        //get key = 1
        int[] functionParameters1 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters1,
                3);
    }
    //test4 update old key with new val
    @Test
    public void test4() {
        int[]functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key = 1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key = 1, value = 3
        int[] functionParameters3 = new int[]{1,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        //get key = 1
        int[] functionParameters4 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters4,
                3);
    }
    //test3 capacity equals to 1
    @Test
    public void test3() {
        int[]functionParameters = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key=2, value = 3
        int[] functionParameters3 = new int[]{2,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        int[] functionParameters4 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get, functionParameters4, -1);

        //put key=-1, value = 3
        int[] functionParameters5 = new int[]{-1,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters5,
                null);

        int[] functionParameters6 = new int[]{-1};
        lruCachePUT.run(LruCacheMethod.Get, functionParameters6, 3);
    }
    //test big cache
    @Test
    public void bigCacheTest() {
        int[]functionParameters = new int[]{100};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key = 1, value = 2
        for (int i = -2; i < 98; i++) {
            int[] functionParameters2 = new int[]{i, i + 1};
            lruCachePUT.run(LruCacheMethod.Put,
                    functionParameters2,
                    null);
        }

        //get key = 1
        int[] functionParameters4 = new int[]{-2};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters4,
                -1);
    }

    //test6 null pointer
    @Test(expected = NullPointerException.class)
    public void testPutCapacityZero() {
        // constructor size = 0
        int[] capacity = new int[]{0};
        lruCachePUT.run(LruCacheMethod.Constructor,
                capacity, null);

        // put key = 1, value = 1
        int[] keyValPair1 = new int[]{1, 1};
        lruCachePUT.run(LruCacheMethod.Put,
                keyValPair1, null);
    }

    @Test
    public void testLargeInput() {
        int[] functionParameters = new int[]{100};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters, null);

        for (int i = 0; i <= 100; i++) {
            int[] functionParameters1 = new int[]{i, i + 1};
            lruCachePUT.run(LruCacheMethod.Put,
                    functionParameters1, null);
        }

        int[] functionParameters2 = new int[]{0};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters2, -1);
    }
}
