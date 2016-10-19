import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by yay on 19.10.2016.
 */
public class SalesmanMain {
    private static final int QUEUE_MAX = 100;

    public static void main(String[] args) {
        Population p1 = new SalesmanPopulation();
        Population p2 = new SalesmanPopulation();
        List<Population> populationList = new ArrayList<>();
        populationList.add(p1);
        populationList.add(p2);
        GeneticDynamicCharting charting = new GeneticDynamicCharting(populationList);
        charting.start();
    }
}
