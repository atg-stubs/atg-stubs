package atg.servlet;

import atg.naming.NameResolver;
import atg.nucleus.logging.ApplicationLogging;
import atg.servlet.exittracking.ExitTrackingHandler;


/**
 * A request wrapper that extends the MutableHttpServletRequest wrapper
 */
public class DynamoHttpServletRequest
    extends MutableHttpServletRequest
    implements NameResolver,
    ExitTrackingHandler,
    ApplicationLogging {


}
