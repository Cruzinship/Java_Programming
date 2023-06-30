package day38_exception;
import utilities.Library;

import java.time.LocalTime;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("Is break3 time");
    }
    public BreakTimeException(String message){
        super(message);
    }
}
