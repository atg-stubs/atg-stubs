package atg.core.exception;

import io.github.atg.stubs.NotImplementedException;

public class ContainerException
    extends Exception
    implements ContainableException {


    public Throwable getSourceException() {
        throw new NotImplementedException("getSourceException", this.getClass());
    }

}
