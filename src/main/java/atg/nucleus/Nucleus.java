package atg.nucleus;

import io.github.atg.stubs.NotImplementedException;

import javax.servlet.*;
import java.io.IOException;

public class Nucleus extends GenericContext implements Servlet {

    public Nucleus(String configPath){

    }

    public void init(ServletConfig config) throws ServletException {
        throw new NotImplementedException("init", this.getClass());
    }

    public ServletConfig getServletConfig() {
        throw new NotImplementedException("getServletConfig", this.getClass());
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new NotImplementedException("service", this.getClass());
    }

    public String getServletInfo() {
        throw new NotImplementedException("getServletInfo", this.getClass());
    }

    public void destroy() {
        throw new NotImplementedException("destroy", this.getClass());
    }
}
