package atg.nucleus;

import atg.naming.*;
import atg.nucleus.logging.ApplicationLoggingSender;
import atg.nucleus.logging.VariableArgumentApplicationLoggingImpl;

import javax.servlet.Servlet;

public class GenericService
    extends VariableArgumentApplicationLoggingImpl
    implements NameContextBindingListener,
        ComponentNameResolver,
        NameContextElement,
        ServiceListener,
        Service,
        ApplicationLoggingSender,
        AdminableService,
        NameContextParentable,
        AbsoluteNameable,
        Configured {

    /**
     * @return the admin servlet that draws and does admin in dyn admin for this service usually a {@link ServiceAdminServlet}
     */
    public Servlet getAdminServlet(){
        return null;
    }

}
