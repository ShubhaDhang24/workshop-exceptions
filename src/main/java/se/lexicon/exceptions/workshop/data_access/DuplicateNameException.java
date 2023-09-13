package se.lexicon.exceptions.workshop.data_access;

public class DuplicateNameException extends Exception {
    public DuplicateNameException(){
        super("Name already exists ");
    }
    public DuplicateNameException(String message) {
        super(message);
    }

}
