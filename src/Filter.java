import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < source.size() ; i++) {

            if (source.get(i) < this.treshold) {
                result.add(source.get(i));
                logger.log(logger.outTime() + " Элемент " + source.get(i) + " проходит.");
            } else {
                logger.log(logger.outTime() + " Элемент " + source.get(i) + " не проходит.");
            }

        }

        return result;
    }
}
