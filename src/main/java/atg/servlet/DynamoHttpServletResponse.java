package atg.servlet;

import io.github.atg.stubs.NotImplementedException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class DynamoHttpServletResponse
    implements HttpServletResponse,
    AddHeaderHttpServletResponse,
    CharacterEncodable {

    public DynamoHttpServletResponse() {

    }

    public DynamoHttpServletResponse(HttpServletResponse response) {

    }


    public void setRequest(DynamoHttpServletRequest pRequest){
        throw new NotImplementedException("setRequest", this.getClass());
    }

    //Being HttpServletResponse implementation
    public void addCookie(Cookie cookie) {
        throw new NotImplementedException("addCookie", this.getClass());
    }

    public boolean containsHeader(String s) {
        throw new NotImplementedException("containsHeader", this.getClass());
    }

    public String encodeURL(String s) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeRedirectURL(String s) {
        throw new NotImplementedException("encodeRedirectURL", this.getClass());
    }

    public String encodeUrl(String s) {
        throw new NotImplementedException("encodeUrl", this.getClass());
    }

    public String encodeRedirectUrl(String s) {
        throw new NotImplementedException("encodeRedirectUrl", this.getClass());
    }

    public void sendError(int i, String s) throws IOException {
        throw new NotImplementedException("sendError", this.getClass());
    }

    public void sendError(int i) throws IOException {
        throw new NotImplementedException("sendError", this.getClass());
    }

    public void sendRedirect(String s) throws IOException {
        throw new NotImplementedException("sendRedirect", this.getClass());
    }

    public void setDateHeader(String s, long l) {
        throw new NotImplementedException("setDateHeader", this.getClass());
    }

    public void addDateHeader(String s, long l) {
        throw new NotImplementedException("addDateHeader", this.getClass());
    }

    public void setHeader(String s, String s1) {
        throw new NotImplementedException("setHeader", this.getClass());
    }

    public void addHeader(String s, String s1) {
        throw new NotImplementedException("addHeader", this.getClass());
    }

    public void setIntHeader(String s, int i) {
        throw new NotImplementedException("setIntHeader", this.getClass());
    }

    public void addIntHeader(String s, int i) {
        throw new NotImplementedException("addIntHeader", this.getClass());
    }

    public void setStatus(int i) {
        throw new NotImplementedException("setStatus", this.getClass());
    }

    public void setStatus(int i, String s) {
        throw new NotImplementedException("setStatus", this.getClass());
    }

    public String getCharacterEncoding() {
        throw new NotImplementedException("getCharacterEncoding", this.getClass());
    }

    public String getContentType() {
        throw new NotImplementedException("getContentType", this.getClass());
    }

    public ServletOutputStream getOutputStream() throws IOException {
        throw new NotImplementedException("getOutputStream", this.getClass());
    }

    public PrintWriter getWriter() throws IOException {
        throw new NotImplementedException("getWriter", this.getClass());
    }

    public void setCharacterEncoding(String s) {
        throw new NotImplementedException("setCharacterEncoding", this.getClass());
    }

    public void setContentLength(int i) {
        throw new NotImplementedException("setContentLength", this.getClass());
    }

    public void setContentType(String s) {
        throw new NotImplementedException("setContentType", this.getClass());
    }

    public void setBufferSize(int i) {
        throw new NotImplementedException("setBufferSize", this.getClass());
    }

    public int getBufferSize() {
        throw new NotImplementedException("getBufferSize", this.getClass());
    }

    public void flushBuffer() throws IOException {
        throw new NotImplementedException("flushBuffer", this.getClass());
    }

    public void resetBuffer() {
        throw new NotImplementedException("resetBuffer", this.getClass());
    }

    public boolean isCommitted() {
        throw new NotImplementedException("isCommitted", this.getClass());
    }

    public void reset() {
        throw new NotImplementedException("reset", this.getClass());
    }

    public void setLocale(Locale locale) {
        throw new NotImplementedException("setLocale", this.getClass());
    }

    public Locale getLocale() {
        throw new NotImplementedException("getLocale", this.getClass());
    }
}
