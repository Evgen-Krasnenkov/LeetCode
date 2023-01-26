import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {
    private static MergeIntervals mergeIntervals;
    @BeforeAll
    public static void init(){
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void mergeOptimalOK() {
        int[][] ints = mergeIntervals.mergeOptimal(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assertions.assertArrayEquals(ints, new int[][]{{1,6},{8,10},{15,18}});
    }

    @Test
    void mergeOK() {
        int[][] ints = mergeIntervals.merge(new int[][]{{1,5},{5,6}});
        Assertions.assertArrayEquals(ints, new int[][]{{1,6}});
    }

    @Test
    void mergeCustomOK() {
        int[][] intsSingle2 = mergeIntervals.mergeSingle(new int[][]{{1,4},{0,0}});
        Assertions.assertArrayEquals(intsSingle2, new int[][]{{0,0},{1,4}});
        int[][] intsSingle1 = mergeIntervals.mergeSingle(new int[][]{{1,4},{0,4}});
        Assertions.assertArrayEquals(intsSingle1, new int[][]{{0,4}});
        int[][] intsSingle = mergeIntervals.mergeSingle(new int[][]{{1,5},{5,6}});
        Assertions.assertArrayEquals(intsSingle, new int[][]{{1,6}});
        int[][] ints4 = mergeIntervals.mergeSingle(new int[][]{{1, 4}, {5, 6}});
        Assertions.assertArrayEquals(ints4, new int[][]{{1, 4}, {5, 6}});
        int[][] intsThird = mergeIntervals.mergeCustom(new int[][]{{1, 4}, {5, 6}});
        Assertions.assertArrayEquals(intsThird, new int[][]{{1,6}});
        int[][] intsSecond = mergeIntervals.mergeCustom(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assertions.assertArrayEquals(intsSecond, new int[][]{{1,6},{8,10},{15,18}});
        int[][] ints = mergeIntervals.mergeCustom(new int[][]{{1,5},{5,6}});
        Assertions.assertArrayEquals(ints, new int[][]{{1,6}});
    }

    @Test
    void mergeSingle() {
        int[][] intsSingle1 = mergeIntervals.mergeSingle(new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}});
        Assertions.assertArrayEquals(intsSingle1, new int[][]{{1,10}});
        int[][] intsSingle = mergeIntervals.mergeSingle(new int[][]{{4,5},{1,4},{0,1}});
        Assertions.assertArrayEquals(intsSingle, new int[][]{{0,5}});
    }
}