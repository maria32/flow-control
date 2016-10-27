/**
 * Created by martanase on 10/27/2016.
 */
public class Exercise3 {

    public boolean posNeg(int a, int b, boolean negative){
        if(negative){
            return (a & b) < 0;
        } else{
            return (a ^ b) < 0;
        }
    }
}
