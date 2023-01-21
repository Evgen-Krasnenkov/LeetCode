import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 */
public class MaxBallsInBox {

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = lowLimit; i <= highLimit; i++){
            Integer sum = sumOfNumbers(i);
            if (map.get(sum) == null){
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }
        return map.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .max(Integer::compareTo)
                .get();
    }
    private int sumOfNumbers(int lowLimit){
        int sum = 0;
        while(lowLimit > 0){
            sum += lowLimit % 10;
            lowLimit = lowLimit / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxBallsInBox maxBallsInBox = new MaxBallsInBox();
        int i = maxBallsInBox.countBalls(19, 28);
    }
}
