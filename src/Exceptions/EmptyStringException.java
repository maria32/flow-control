package Exceptions;

/**
 * Created by martanase on 10/27/2016.
 */
public class EmptyStringException extends Exception{

    public boolean empty = false;

    public EmptyStringException(String str){
        if(str != null && str.isEmpty()){
            this.empty = true;
        }
    }
}
