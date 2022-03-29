package jsjf.exceptions;
import jsjf.exceptions.*;
public class NonComparableElementException extends RuntimeException {

    public NonComparableElementException(String collection) {

        super("The " + collection + " is empty.");
    }
}
