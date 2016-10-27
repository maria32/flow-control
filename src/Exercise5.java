
/**
 * Created by martanase on 10/27/2016.
 */
public class Exercise5 {

    public String everyNth(String str, int n)  {
        String s = "";
        try{
            if (!str.isEmpty()){
                if(n > 0) {
                    for (int i = 0; i < str.length(); i = i + n)
                        s = s + str.charAt(i);
                }else{
                    System.out.println("*** n = 0 ***");
                }
                return s;
            } else{
                System.out.println("***String is empty!***");
            }
        } catch(Exception e){
            System.out.println("***String is null!***");
        }
        return "";
    }
}
