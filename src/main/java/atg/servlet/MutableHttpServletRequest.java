package atg.servlet;

import io.github.atg.stubs.NotImplementedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * A request wrapper around an HttpSevletRequest
 */
public class MutableHttpServletRequest implements HttpServletRequest {

    /**
     * Creates a reqeust wrapper with no underlying request
     */
    public MutableHttpServletRequest() {
    }

    /**
     * Creates this request wrapper with the given underlying request
     * @param req the underlying request to wrap
     */
    public MutableHttpServletRequest(HttpServletRequest req) {

    }

    /**
     * Sets the underlying request object to this wrapper request
     * @param req the underlying request object
     */
    public void setRequest(HttpServletRequest req) {
        throw new NotImplementedException("setRequest", this.getClass());
    }

    public HttpServletRequest getRequest() {
        throw new NotImplementedException("getRequest", this.getClass());
    }


    public void setContentLength(int length) {
        throw new NotImplementedException("setContentLength", this.getClass());
    }

    public void setContentType(String type) {
        throw new NotImplementedException("setContentType", this.getClass());
    }

    public void setProtocol(String protocol) {
        throw new NotImplementedException("setProtocol", this.getClass());
    }

    public void setScheme(String scheme) {
        throw new NotImplementedException("setScheme", this.getClass());
    }

    public void setServerName(String name) {
        throw new NotImplementedException("setServerName", this.getClass());
    }

    public void setServerPort(int port) {
        throw new NotImplementedException("setServerPort", this.getClass());
    }

    public void setRemoteAddr(String address) {
        throw new NotImplementedException("setRemoteAddr", this.getClass());
    }

    public void setRemoteHost(String host) {
        throw new NotImplementedException("setRemoteHost", this.getClass());
    }

    public void setInputStream(ServletInputStream stream) {
        throw new NotImplementedException("setInputStream", this.getClass());
    }

    public void setMethod(String method) {
        throw new NotImplementedException("setMethod", this.getClass());
    }

    public void setRequestURI(String uri) {
        throw new NotImplementedException("setRequestURI", this.getClass());
    }

    public void setServletPath(String path) {
        throw new NotImplementedException("setServletPath", this.getClass());
    }

    public void setPathInfo(String info) {
        throw new NotImplementedException("setPathInfo", this.getClass());
    }

    public void setPathTranslated(String path) {
        throw new NotImplementedException("setPathTranslated", this.getClass());
    }

    public void setQueryString(String queryString) {
        throw new NotImplementedException("setQueryString", this.getClass());
    }

    public void setRemoteUser(String user) {
        throw new NotImplementedException("setRemoteUser", this.getClass());
    }

    public void setAuthType(String type) {
        throw new NotImplementedException("setAuthType", this.getClass());
    }

    public void setContextPath(String path) {
        throw new NotImplementedException("setContextPath", this.getClass());
    }

    public synchronized Object getPermanentAttribute(AttributeFactory factory){
        throw new NotImplementedException("getPermanentAttribute", this.getClass());
    }

    public void setAttributeFactory(String pName, AttributeFactory pFactory) {
        throw new NotImplementedException("setAttributeFactory", this.getClass());
    }

    public Object getAttribute(String name, boolean create) {
        throw new NotImplementedException("getAttribute", this.getClass());
    }


    //BEGIN HttpServletRequest members
    public String getAuthType() {
        throw new NotImplementedException("getAuthType", this.getClass());
    }

    public Cookie[] getCookies() {
        throw new NotImplementedException("getCookies", this.getClass());
    }

    public long getDateHeader(String s) {
        throw new NotImplementedException("getDateHeader", this.getClass());
    }

    public String getHeader(String s) {
        throw new NotImplementedException("getHeader", this.getClass());
    }

    public Enumeration getHeaders(String s) {
        throw new NotImplementedException("getHeaders", this.getClass());
    }

    public Enumeration getHeaderNames() {
        throw new NotImplementedException("getHeaderNames", this.getClass());
    }

    public int getIntHeader(String s) {
        throw new NotImplementedException("getIntHeader", this.getClass());
    }

    public String getMethod() {
        throw new NotImplementedException("getMethod", this.getClass());
    }

    public String getPathInfo() {
        throw new NotImplementedException("getPathInfo", this.getClass());
    }

    public String getPathTranslated() {
        throw new NotImplementedException("getPathTranslated", this.getClass());
    }

    public String getContextPath() {
        throw new NotImplementedException("getContextPath", this.getClass());
    }

    public String getQueryString() {
        throw new NotImplementedException("getQueryString", this.getClass());
    }

    public String getRemoteUser() {
        throw new NotImplementedException("getRemoteUser", this.getClass());
    }

    public boolean isUserInRole(String s) {
        throw new NotImplementedException("isUserInRole", this.getClass());
    }

    public Principal getUserPrincipal() {
        throw new NotImplementedException("getUserPrincipal", this.getClass());
    }

    public String getRequestedSessionId() {
        throw new NotImplementedException("getRequestedSessionId", this.getClass());
    }

    public String getRequestURI() {
        throw new NotImplementedException("getRequestURI", this.getClass());
    }

    public StringBuffer getRequestURL() {
        throw new NotImplementedException("getRequestURL", this.getClass());
    }

    public String getServletPath() {
        throw new NotImplementedException("getServletPath", this.getClass());
    }

    public HttpSession getSession(boolean b) {
        throw new NotImplementedException("getSession", this.getClass());
    }

    public HttpSession getSession() {
        throw new NotImplementedException("getSession", this.getClass());
    }

    public boolean isRequestedSessionIdValid() {
        throw new NotImplementedException("isRequestedSessionIdValid", this.getClass());
    }

    public boolean isRequestedSessionIdFromCookie() {
        throw new NotImplementedException("isRequestedSessionIdFromCookie", this.getClass());
    }

    public boolean isRequestedSessionIdFromURL() {
        throw new NotImplementedException("isRequestedSessionIdFromURL", this.getClass());
    }

    public boolean isRequestedSessionIdFromUrl() {
        throw new NotImplementedException("isRequestedSessionIdFromUrl", this.getClass());
    }

    public Object getAttribute(String s) {
        throw new NotImplementedException("getAttribute", this.getClass());
    }

    public Enumeration getAttributeNames() {
        throw new NotImplementedException("getAttributeNames", this.getClass());
    }

    public String getCharacterEncoding() {
        throw new NotImplementedException("getCharacterEncoding", this.getClass());
    }

    public void setCharacterEncoding(String s) throws UnsupportedEncodingException {
        throw new NotImplementedException("setCharacterEncoding", this.getClass());
    }

    public int getContentLength() {
        throw new NotImplementedException("getContentLength", this.getClass());
    }

    public String getContentType() {
        throw new NotImplementedException("getContentType", this.getClass());
    }

    public ServletInputStream getInputStream() throws IOException {
        throw new NotImplementedException("getInputStream", this.getClass());
    }

    public String getParameter(String s) {
        throw new NotImplementedException("getParameter", this.getClass());
    }

    public Enumeration getParameterNames() {
        throw new NotImplementedException("getParameterNames", this.getClass());
    }

    public String[] getParameterValues(String s) {
        throw new NotImplementedException("getParameterValues", this.getClass());
    }

    public Map getParameterMap() {
        throw new NotImplementedException("getParameterMap", this.getClass());
    }

    public String getProtocol() {
        throw new NotImplementedException("getProtocol", this.getClass());
    }

    public String getScheme() {
        throw new NotImplementedException("getScheme", this.getClass());
    }

    public String getServerName() {
        throw new NotImplementedException("getServerName", this.getClass());
    }

    public int getServerPort() {
        throw new NotImplementedException("getServerPort", this.getClass());
    }

    public BufferedReader getReader() throws IOException {
        throw new NotImplementedException("getReader", this.getClass());
    }

    public String getRemoteAddr() {
        throw new NotImplementedException("getRemoteAddr", this.getClass());
    }

    public String getRemoteHost() {
        throw new NotImplementedException("getRemoteHost", this.getClass());
    }

    public void setAttribute(String s, Object o) {
        throw new NotImplementedException("setAttribute", this.getClass());
    }

    public void removeAttribute(String s) {
        throw new NotImplementedException("removeAttribute", this.getClass());
    }

    public Locale getLocale() {
        throw new NotImplementedException("getLocale", this.getClass());
    }

    public Enumeration getLocales() {
        throw new NotImplementedException("getLocales", this.getClass());
    }

    public boolean isSecure() {
        throw new NotImplementedException("isSecure", this.getClass());
    }

    public RequestDispatcher getRequestDispatcher(String s) {
        throw new NotImplementedException("getRequestDispatcher", this.getClass());
    }

    public String getRealPath(String s) {
        throw new NotImplementedException("getRealPath", this.getClass());
    }

    public int getRemotePort() {
        throw new NotImplementedException("getRemotePort", this.getClass());
    }

    public String getLocalName() {
        throw new NotImplementedException("getLocalName", this.getClass());
    }

    public String getLocalAddr() {
        throw new NotImplementedException("getLocalAddr", this.getClass());
    }

    public int getLocalPort() {
        throw new NotImplementedException("getLocalPort", this.getClass());
    }








}
