/**
 * Created by martanase on 10/27/2016.
 */
public class Parrot {

    public boolean parrotTrouble(boolean talking, int hour){
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }
}
