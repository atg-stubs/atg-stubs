package atg.servlet;

import atg.naming.NameResolver;
import atg.nucleus.logging.ApplicationLogging;
import atg.servlet.exittracking.ExitTrackingHandler;
import io.github.atg.stubs.NotImplementedException;


/**
 * A request wrapper that extends the MutableHttpServletRequest wrapper
 */
public class DynamoHttpServletRequest
    extends MutableHttpServletRequest
    implements NameResolver,
    ExitTrackingHandler,
    ApplicationLogging {


    public void setResponse(DynamoHttpServletResponse pResponse){
        throw new NotImplementedException("setResponse", this.getClass());
    }

    public boolean isBrowserType(String pFeature) {
        throw new NotImplementedException("isBrowserType", this.getClass());
    }
}
