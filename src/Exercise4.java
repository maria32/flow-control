/**
 * Created by martanase on 10/27/2016.
 */
public class Exercise4 {

    public String backAroung(String str){
        try {
            return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        }catch(Exception e){
            return "***String-ul este null sau empty!!***";
        }
    }
}
