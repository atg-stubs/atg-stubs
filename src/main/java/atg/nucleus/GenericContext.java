package atg.nucleus;

import atg.naming.NameContext;
import atg.naming.NameContextBindingEventSource;
import atg.naming.NameContextCreator;
import atg.naming.NameContextPreBindingEventSource;
import io.github.atg.stubs.NotImplementedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

public class GenericContext
    extends GenericService
    implements NameContext,
    NameContextBindingEventSource,
    NameContextPreBindingEventSource,
    ServletContext,
    NameContextCreator,
    ConfigurationLockRegistry {

    public String getContextPath() {
        throw new NotImplementedException("getContextPath", this.getClass());
    }

    public ServletContext getContext(String uripath) {
        throw new NotImplementedException("getContext", this.getClass());
    }

    public int getMajorVersion() {
        throw new NotImplementedException("getMajorVersion", this.getClass());
    }

    public int getMinorVersion() {
        throw new NotImplementedException("getMinorVersion", this.getClass());
    }

    public String getMimeType(String file) {
        throw new NotImplementedException("getMimeType", this.getClass());
    }

    public Set getResourcePaths(String path) {
        throw new NotImplementedException("getResourcePaths", this.getClass());
    }

    public URL getResource(String path) throws MalformedURLException {
        throw new NotImplementedException("getResource", this.getClass());
    }

    public InputStream getResourceAsStream(String path) {
        throw new NotImplementedException("getResourceAsStream", this.getClass());
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        throw new NotImplementedException("getRequestDispatcher", this.getClass());
    }

    public RequestDispatcher getNamedDispatcher(String name) {
        throw new NotImplementedException("getNamedDispatcher", this.getClass());
    }

    public Servlet getServlet(String name) throws ServletException {
        throw new NotImplementedException("getServlet", this.getClass());
    }

    public Enumeration getServlets() {
        throw new NotImplementedException("getServlets", this.getClass());
    }

    public Enumeration getServletNames() {
        throw new NotImplementedException("getSevletNames", this.getClass());
    }

    public void log(String msg) {
        throw new NotImplementedException("log", this.getClass());
    }

    public void log(Exception exception, String msg) {
        throw new NotImplementedException("log", this.getClass());
    }

    public void log(String message, Throwable throwable) {
        throw new NotImplementedException("log", this.getClass());
    }

    public String getRealPath(String path) {
        throw new NotImplementedException("getRealPath", this.getClass());
    }

    public String getServerInfo() {
        throw new NotImplementedException("getServerInfo", this.getClass());
    }

    public String getInitParameter(String name) {
        throw new NotImplementedException("getInitParameter", this.getClass());
    }

    public Enumeration getInitParameterNames() {
        throw new NotImplementedException("getInitParameterNames", this.getClass());
    }

    public Object getAttribute(String name) {
        throw new NotImplementedException("getAttribute", this.getClass());
    }

    public Enumeration getAttributeNames() {
        throw new NotImplementedException("getAttributeNames", this.getClass());
    }

    public void setAttribute(String name, Object object) {
        throw new NotImplementedException("setAttribute", this.getClass());
    }

    public void removeAttribute(String name) {
        throw new NotImplementedException("removeAttribute", this.getClass());
    }

    public String getServletContextName() {
        throw new NotImplementedException("getServletContextName", this.getClass());
    }
}
