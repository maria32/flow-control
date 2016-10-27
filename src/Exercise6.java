import java.util.Arrays;

/**
 * Created by martanase on 10/27/2016.
 */
public class Exercise6 {

    public boolean scoresIncreasing(int[] scores){
        for(int i = 1; i < scores.length; i++){

            if(scores[i] < scores[i-1])
                return false;
        }
        return true;
    }
}
