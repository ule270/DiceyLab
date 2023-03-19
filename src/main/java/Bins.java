import java.util.HashMap;
import java.util.Map;

public class Bins {
    private int minPossValue;
    private int maxPossValue;
    Map<Integer, Integer> numberOfOccurrences = new HashMap<Integer, Integer>();
    public Bins(int minPossValue, int maxPossValue){
        this.minPossValue = minPossValue;
        this.maxPossValue = maxPossValue;
        initMap(minPossValue, maxPossValue);
    }
    public void initMap(int minPossValue, int maxPossValue){
        for (int i = minPossValue; i <= maxPossValue; i++) {
            numberOfOccurrences.put(i, 0);
        }
    }
    public Integer numberOfResults(Integer rollResult) {

        return numberOfOccurrences.get(rollResult);
    }
    public void incrementBin(Integer rollResult){
        numberOfOccurrences.put(rollResult, numberOfResults(rollResult)+1);
    }

}


