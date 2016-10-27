package Exceptions;

/**
 * Created by martanase on 10/27/2016.
 */
public class UnderflowException extends Exception{

    public UnderflowException() {
        System.out.println(("Exceptions.UnderflowException: Minimum value exceeded."));
    }
}
