/**
 * Created by martanase on 10/27/2016.
 */
public class Finally {

    public Finally(){
        int nr = 0;
        try{
            nr = 4;
            System.out.println("I am in try\n\t nr=" + nr);
            return;
        }finally{
            nr = 8;
            System.out.println("I am in finally\n\t nr=" + nr);
        }
    }
}
