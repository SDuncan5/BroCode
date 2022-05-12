package CustomExceptions;

public class AgeException extends Exception { //needs to extend Exception

    AgeException(String message) {
        super(message); //calls super constructor (Exception constructor) to handle exceptions like normal
    }

}
