package atg.nucleus;

import atg.naming.*;
import atg.nucleus.logging.ApplicationLoggingSender;
import atg.nucleus.logging.VariableArgumentApplicationLoggingImpl;
import io.github.atg.stubs.NotImplementedException;

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
        throw new NotImplementedException("getAdminServlet", this.getClass());
    }

    /**
     * @return the newly created admin servlet that draws and does admin in dyn admin for this service usually a {@link ServiceAdminServlet}
     */
    protected Servlet createAdminServlet(){
        throw new NotImplementedException("createAdminServlet", this.getClass());
    }


    public Nucleus getNucleus(){
        throw new NotImplementedException("getNucleus", this.getClass());
    }

    public void setNucleus(Nucleus nucleus){
        throw new NotImplementedException("setNucleus", this.getClass());
    }

}
