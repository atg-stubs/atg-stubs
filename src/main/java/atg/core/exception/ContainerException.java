package atg.core.exception;

public class ContainerException
    extends Exception
    implements ContainableException {


    public Throwable getSourceException() {
        return null;
    }

    public static class RepositoryException extends ContainerException {

    }
}
