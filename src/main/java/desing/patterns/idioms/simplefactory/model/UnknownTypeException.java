package desing.patterns.idioms.simplefactory.model;

public class UnknownTypeException extends RuntimeException {

    public UnknownTypeException() {
        super("Unknown person type");
    }

    public UnknownTypeException(final String msg) {
        super(msg);
    }
}
