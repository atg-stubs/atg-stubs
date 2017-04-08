package atg.nucleus;

import atg.beans.NotSerializable;
import io.github.atg.stubs.NotImplementedException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServiceAdminServlet
    extends HttpServlet
    implements PropertyValueFormatter,
    NotSerializable {

    public ServiceAdminServlet(Object pService, Nucleus pNucleus) {

    }

    /**
     * prints the admin section of a nucleus service in dyn admin to the servletoutput stream
     * @param request
     * @param response
     * @param out
     * @throws ServletException
     * @throws IOException
     */
    protected void printAdmin(
        HttpServletRequest request,
        HttpServletResponse response,
        ServletOutputStream out
    ) throws ServletException, IOException {
        throw new NotImplementedException("printAdmin", this.getClass());

    }

    /**
     * prints stuff right before the closing head tag
     * @param req
     * @param res
     * @param out
     * @throws ServletException
     * @throws IOException
     */
    protected void insertStyle(
        HttpServletRequest req,
        HttpServletResponse res,
        ServletOutputStream out
    ) throws ServletException, IOException {
        throw new NotImplementedException("insertStyle", this.getClass());
    }
}
