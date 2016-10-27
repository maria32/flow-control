import Exceptions.OverflowException;
import Exceptions.UnderflowException;

import java.util.Collection;
import java.util.List;

/**
 * Created by martanase on 10/27/2016.
 */
public class Calculator {

    public Integer add(Integer a, Integer b){

        int sum = 0;
        try {
            if ((b > 0) && (a > (Integer.MAX_VALUE - b))){
                throw new OverflowException();
            } else if ((b < 0) && (a < (Integer.MIN_VALUE - b))){
                throw new UnderflowException();
            } else {
                sum = a + b;
            }
        }catch(OverflowException over){
            System.out.println(over.getMessage());

        }catch(UnderflowException under){

        }
        return sum;
    }

    public Integer divide(Integer a, Integer b){
        return a/b;
    }

    public Integer average(List<Integer> lista){
        Integer av = 0;
        for( int elem: lista){
            av = add(av, elem);
        }
        return divide(av, lista.size());
    }
}
