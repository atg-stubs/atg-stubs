package atg.nucleus.servlet;

import atg.nucleus.TimedOperationService;
import io.github.atg.stubs.NotImplementedException;

import javax.servlet.*;
import java.io.IOException;

public abstract class ServletService
    extends TimedOperationService
    implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {
        throw new NotImplementedException("init", this.getClass());
    }

    public ServletConfig getServletConfig() {
        throw new NotImplementedException("getServletConfig", this.getClass());
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        throw new NotImplementedException("service", this.getClass());
    }

    public String getServletInfo() {
        throw new NotImplementedException("getServletInfo", this.getClass());
    }

    public void setServletInfo() {
        throw new NotImplementedException("setServletInfo", this.getClass());
    }

    public void destroy() {
        throw new NotImplementedException("destroy", this.getClass());
    }
}
