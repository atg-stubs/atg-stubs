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

    public String getAbsoluteName(){
        throw new NotImplementedException(
            "getAbsoluteName",
            this.getClass()
        );
    }


    @Override
    public boolean isLoggingDebug() {
        throw new NotImplementedException(
            "isLoggingDebug",
            this.getClass()
        );
    }

    @Override
    public void setLoggingDebug(boolean logDebug) {
        throw new NotImplementedException(
            "setLoggingDebug",
            this.getClass()
        );
    }

    @Override
    public void logDebug(String msg) {
        throw new NotImplementedException(
            "logDebug",
            this.getClass()
        );
    }

    @Override
    public void logDebug(Throwable throwable) {
        throw new NotImplementedException(
            "logDebug",
            this.getClass()
        );
    }

    @Override
    public void logDebug(String msg, Throwable throwable) {
        throw new NotImplementedException(
            "logDebug",
            this.getClass()
        );
    }

    @Override
    public boolean isLoggingInfo() {
        throw new NotImplementedException(
            "isLoggingInfo",
            this.getClass()
        );
    }

    @Override
    public void setLoggingInfo(boolean logInfo) {
        throw new NotImplementedException(
            "setLoggingInfo",
            this.getClass()
        );
    }

    @Override
    public void logInfo(String msg) {
        throw new NotImplementedException(
            "logInfo",
            this.getClass()
        );
    }

    @Override
    public void logInfo(Throwable throwable) {
        throw new NotImplementedException(
            "logInfo",
            this.getClass()
        );
    }

    @Override
    public void logInfo(String msg, Throwable throwable) {
        throw new NotImplementedException(
            "logInfo",
            this.getClass()
        );
    }

    @Override
    public boolean isLoggingWarning() {
        throw new NotImplementedException(
            "isLoggingWarning",
            this.getClass()
        );
    }

    @Override
    public void setLoggingWarning(boolean logWarn) {
        throw new NotImplementedException(
            "setLoggingWarning",
            this.getClass()
        );
    }

    @Override
    public void logWarning(String msg) {
        throw new NotImplementedException(
            "logWarning",
            this.getClass()
        );
    }

    @Override
    public void logWarning(Throwable throwable) {
        throw new NotImplementedException(
            "logWarning",
            this.getClass()
        );
    }

    @Override
    public void logWarning(String msg, Throwable throwable) {
        throw new NotImplementedException(
            "logWarning",
            this.getClass()
        );
    }

    @Override
    public boolean isLoggingError() {
        throw new NotImplementedException(
            "isLoggingError",
            this.getClass()
        );
    }

    @Override
    public void setLoggingError(boolean logError) {
        throw new NotImplementedException(
            "setLoggingError",
            this.getClass()
        );
    }

    @Override
    public void logError(String msg) {
        throw new NotImplementedException(
            "logError",
            this.getClass()
        );
    }

    @Override
    public void logError(Throwable throwable) {
        throw new NotImplementedException(
            "logError",
            this.getClass()
        );
    }

    @Override
    public void logError(String msg, Throwable throwable) {
        throw new NotImplementedException(
            "logError",
            this.getClass()
        );
    }
}
