package atg.servlet;

import atg.droplet.TagConverter;
import atg.naming.NameContext;
import atg.naming.NameResolver;
import atg.nucleus.*;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.naming.ComponentName;
import atg.nucleus.naming.ParameterName;
import atg.security.UserAuthenticator;
import atg.servlet.exittracking.ExitTrackingHandler;
import atg.servlet.minimal.WebApplicationInterface;
import atg.servlet.pipeline.RedirectURLValidator;
import io.github.atg.stubs.NotImplementedException;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintStream;
import java.security.Principal;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;


/**
 * A request wrapper that extends the MutableHttpServletRequest wrapper
 */
public class DynamoHttpServletRequest
    extends MutableHttpServletRequest
    implements NameResolver,
    ExitTrackingHandler,
    ApplicationLogging {


    protected void swapRequest(HttpServletRequest req) {
        throw new NotImplementedException("swapRequest", this.getClass());
    }

    public void setRequest(HttpServletRequest req) {
        throw new NotImplementedException("setRequest", this.getClass());
    }

    public void endRequest() {
        throw new NotImplementedException("endRequest", this.getClass());
    }

    public void setResponse(DynamoHttpServletResponse res) {
        throw new NotImplementedException("setResponse", this.getClass());
    }

    public DynamoHttpServletResponse getResponse() {
        throw new NotImplementedException("getResponse", this.getClass());
    }

    public void setUserAuthenticator(UserAuthenticator authenticator) {
        throw new NotImplementedException("setUserAuthenticator", this.getClass());
    }

    public UserAuthenticator getUserAuthenticator() {
        throw new NotImplementedException("getUserAuthenticator", this.getClass());
    }

    public void setLog(ApplicationLogging log) {
        throw new NotImplementedException("setLog", this.getClass());
    }

    public ApplicationLogging getLog() {
        throw new NotImplementedException("getLog", this.getClass());
    }

    public WebApplicationInterface getWebApplication() {
        throw new NotImplementedException("getWebApplication", this.getClass());
    }

    public String getURLParameterString() {
        throw new NotImplementedException("getURLParameterString", this.getClass());
    }

    public void setParameterDelimiter(String delimitter) {
        throw new NotImplementedException("setParameterDelimiter", this.getClass());
    }

    public String getParameterDelimiter() {
        throw new NotImplementedException("getParameterDelimiter", this.getClass());
    }

    public void setUseXmlParamDelimiter(Boolean useDelimiter) {
        throw new NotImplementedException("setUseXmlParamDelimiter", this.getClass());
    }

    public Boolean isUseXmlParamDelimiter() {
        throw new NotImplementedException("isUseXmlParamDelimiter", this.getClass());
    }

    public void setScrambleKey(byte[] scrambleKey) {
        throw new NotImplementedException("setScrambleKey", this.getClass());
    }

    public byte[] getScrambleKey() {
        throw new NotImplementedException("getScrambleKey", this.getClass());
    }

    public void setMimeTyper(MimeTyper mimeTyper) {
        throw new NotImplementedException("setMimeTyper", this.getClass());
    }

    public MimeTyper getMimeTyper() {
        throw new NotImplementedException("getMimeTyper", this.getClass());
    }

    public void setNameResolverFactory(MultiRootNameResolverFactory resolverFactory) {
        throw new NotImplementedException("setNameResolverFactory", this.getClass());
    }

    public MultiRootNameResolverFactory getNameResolverFactory() {
        throw new NotImplementedException("getNameResolverFactory", this.getClass());
    }

    public void setMultiNucleusNameResolverFactory(MultiRootNameResolverFactory resolverFactory) {
        throw new NotImplementedException("setMultiNucleusNameResolverFactory", this.getClass());
    }

    public MultiRootNameResolverFactory getMultiNucleusNameResolverFactory() {
        throw new NotImplementedException("getMultiNucleusNameResolverFactory", this.getClass());
    }

    public boolean isDelayedRequest() {
        throw new NotImplementedException("isDelayedRequest", this.getClass());
    }

    public void setParameterHandler(ParameterHandler handler) {
        throw new NotImplementedException("setParameterHandler", this.getClass());
    }

    public void setExitTrackingHandler(ExitTrackingHandler handler) {
        throw new NotImplementedException("setExitTrackingHandler", this.getClass());
    }

    public ExitTrackingHandler getExitTrackingHandler() {
        throw new NotImplementedException("getExitTrackingHandler", this.getClass());
    }

    public HttpSessionRequest getSessionRequest() {
        throw new NotImplementedException("getSessionRequest", this.getClass());
    }

    public HttpSessionRequest getSessionRequest(boolean create) {
        throw new NotImplementedException("getSessionRequest", this.getClass());
    }

    public void setSessionRequest(HttpSessionRequest req) {
        throw new NotImplementedException("setSessionRequest", this.getClass());
    }

    public void removeSessionFromRequest() {
        throw new NotImplementedException("removeSessionFromRequest", this.getClass());
    }

    public void setRequestScopeManager(RequestScopeManager manager) {
        throw new NotImplementedException("setRequestScopeManager", this.getClass());
    }

    public RequestScopeManager getRequestScopeManager() {
        throw new NotImplementedException("getRequestScopeManager", this.getClass());
    }

    public void setWindowScopeManager(WindowScopeManager manager) {
        throw new NotImplementedException("setWindowScopeManager", this.getClass());
    }

    public WindowScopeManager getWindowScopeManager() {
        throw new NotImplementedException("getWindowScopeManager", this.getClass());
    }

    public void setRequestScope(NameContext scope) {
        throw new NotImplementedException("setRequestScope", this.getClass());
    }

    public NameContext getRequestScope() {
        throw new NotImplementedException("getRequestScope", this.getClass());
    }

    public boolean hasRequestScope() {
        throw new NotImplementedException("hasRequestScope", this.getClass());
    }

    public NameContext getWindowScope() {
        throw new NotImplementedException("getWindowScope", this.getClass());
    }

    public DynamoHttpServletRequest getRequestForComparison() {
        throw new NotImplementedException("getRequestForComparison", this.getClass());
    }

    public Nucleus getNucleus() {
        throw new NotImplementedException("getNucleus", this.getClass());
    }

    public void setNucleus(Nucleus nucleus) {
        throw new NotImplementedException("setNucleus", this.getClass());
    }

    public BrowserTyper getBrowserTyper() {
        throw new NotImplementedException("getBrowserTyper", this.getClass());
    }

    public void setBrowserTyper(BrowserTyper typer) {
        throw new NotImplementedException("setBrowserTyper", this.getClass());
    }

    public boolean getGenerateRequestLocales() {
        throw new NotImplementedException("getGenerateRequestLocales", this.getClass());
    }

    public void setGenerateRequestLocales(boolean generateLocales) {
        throw new NotImplementedException("setGenerateRequestLocales", this.getClass());
    }

    public ComponentName getRequestLocalePath() {
        throw new NotImplementedException("getRequestLocalePath", this.getClass());
    }

    public void setRequestLocalePath(ComponentName requestPath) {
        throw new NotImplementedException("setRequestLocalePath", this.getClass());
    }

    public RequestLocale getRequestLocale() {
        throw new NotImplementedException("getRequestLocale", this.getClass());
    }

    public void setRequestLocale(RequestLocale locale) {
        throw new NotImplementedException("setRequestLocale", this.getClass());
    }

    public void setInitialized(boolean initialized) {
        throw new NotImplementedException("setInitialized", this.getClass());
    }

    public boolean isInitialized() {
        throw new NotImplementedException("isInitialized", this.getClass());
    }

    public String getRequestURI() {
        throw new NotImplementedException("getRequestURI", this.getClass());
    }

    public String getRequestURIWithQueryString() {
        throw new NotImplementedException("getRequestURIWithQueryString", this.getClass());
    }

    public Enumeration getParameterNamesInStack() {
        throw new NotImplementedException("getParameterNamesInStack", this.getClass());
    }

    public String getQueryParameter(String key) {
        throw new NotImplementedException("getQueryParameter", this.getClass());
    }

    public String getQueryParameter(String key, int index) {
        throw new NotImplementedException("getQueryParameter", this.getClass());
    }

    public String[] getQueryParameterValues(String key) {
        throw new NotImplementedException("getQueryParameterValues", this.getClass());
    }

    public Enumeration getQueryParameterNames() {
        throw new NotImplementedException("getQueryParameterNames", this.getClass());
    }

    public int getQueryParameterCount(String key) {
        throw new NotImplementedException("getQueryParameterCount", this.getClass());
    }

    public String getPostParameter(String key) {
        throw new NotImplementedException("getPostParameter", this.getClass());
    }

    public String getPostParameter(String key, int index) {
        throw new NotImplementedException("getPostParameter", this.getClass());
    }

    public String[] getPostParameterValues(String key) {
        throw new NotImplementedException("getPostParameterValues", this.getClass());
    }

    public Enumeration getPostParameterNames() {
        throw new NotImplementedException("getPostParameterNames", this.getClass());
    }

    public int getPostParameterCount(String key) {
        throw new NotImplementedException("getPostParameterCount", this.getClass());
    }

    public String getURLParameter(String key) {
        throw new NotImplementedException("getURLParameter", this.getClass());
    }

    public String getURLParameter(String key, int index) {
        throw new NotImplementedException("getURLParameter", this.getClass());
    }

    public Object getObjectURLParameter(String key, int index) {
        throw new NotImplementedException("getObjectURLParameter", this.getClass());
    }

    public String[] getURLParameterValues(String key) {
        throw new NotImplementedException("getURLParameterValues", this.getClass());
    }

    public Enumeration getURLParameterNames() {
        throw new NotImplementedException("getURLParameterNames", this.getClass());
    }

    public int getURLParameterCount(String key) {
        throw new NotImplementedException("getURLParameterCount", this.getClass());
    }

    public boolean tamperedURLParameters() {
        throw new NotImplementedException("tamperedURLParameters", this.getClass());
    }

    public boolean getEncodeServletPath() {
        throw new NotImplementedException("getEncodeServletPath", this.getClass());
    }

    public void setEncodeServletPath(boolean encodePath) {
        throw new NotImplementedException("setEncodeServletPath", this.getClass());
    }

    public int getEncodeContextPathMode() {
        throw new NotImplementedException("getEncodeContextPathMode", this.getClass());
    }

    public void setEncodeContextPathMode(int encodeMode) {
        throw new NotImplementedException("setEncodeContextPathMode", this.getClass());
    }

    public String getCookieParameter(String key) {
        throw new NotImplementedException("getCookieParameter", this.getClass());
    }

    public String getCookieParameter(String key, int index) {
        throw new NotImplementedException("getCookieParameter", this.getClass());
    }

    public String[] getCookieParameterValues(String key) {
        throw new NotImplementedException("getCookieParameterValues", this.getClass());
    }

    public Enumeration getCookieParameterNames() {
        throw new NotImplementedException("getCookieParameterNames", this.getClass());
    }

    public int getCookieParameterCount(String key) {
        throw new NotImplementedException("getCookieParameterCount", this.getClass());
    }

    public boolean isBrowserType(String feature) {
        throw new NotImplementedException("isBrowserType", this.getClass());
    }

    public String toString() {
        throw new NotImplementedException("toString", this.getClass());
    }

    public String getMimeType() {
        throw new NotImplementedException("getMimeType", this.getClass());
    }

    public void setMimeType(String mimeType) {
        throw new NotImplementedException("setMimeType", this.getClass());
    }

    public String getWorkingDirectory() {
        throw new NotImplementedException("getWorkingDirectory", this.getClass());
    }

    public void setLinkEncoding(String linkEncoding) {
        throw new NotImplementedException("setLinkEncoding", this.getClass());
    }

    public String getLinkEncoding() {
        throw new NotImplementedException("getLinkEncoding", this.getClass());
    }

    public void addQueryParameter(String key, String val) {
        throw new NotImplementedException("addQueryParameter", this.getClass());
    }

    public void addURLParameter(String key, String val) {
        throw new NotImplementedException("addURLParameter", this.getClass());
    }

    public void addPersistentQueryParameter(String key, String val) {
        throw new NotImplementedException("addPersistentQueryParameter", this.getClass());
    }

    public void removePersistentQueryParameter(String key) {
        throw new NotImplementedException("removePersistentQueryParameter", this.getClass());
    }

    public String encodeURL(String url) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean clearParams) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String performExitTracking(String url) {
        throw new NotImplementedException("performExitTracking", this.getClass());
    }

    public boolean shouldExitTrack(String url) {
        throw new NotImplementedException("shouldExitTrack", this.getClass());
    }

    public String getExitTrackingParameterName() {
        throw new NotImplementedException("getExitTrackingParameterName", this.getClass());
    }

    public String encodeURL(String url, boolean encodeParameters, boolean clearParameters, boolean isImageURL) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean encodeParameters, boolean clearParameters, boolean isImageURL, boolean interpretURIs) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean encodeParameters, boolean clearParameters, boolean isImageURL, boolean interpretURIs, boolean doExitTracking) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean encodeParameters, boolean clearParameters, boolean isImageURL, boolean interpretURIs, boolean doExitTracking, boolean useReverseMap) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean encodeParameters, boolean clearParameters, boolean isImageURL, boolean interpretURIs, boolean doExitTracking, int prependMode) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String encodeURL(String url, boolean ecodeParameters, boolean clearParameters, boolean isImageURL, boolean interpretURIs, boolean doExitTracking, int prependMode, boolean useReverseMap) {
        throw new NotImplementedException("encodeURL", this.getClass());
    }

    public String reverseMapContextRootForLayering(String finalURL) {
        throw new NotImplementedException("reverseMapContextRootForLayering", this.getClass());
    }

    public void setEncodeURL(boolean encodeURL) {
        throw new NotImplementedException("setEncodeURL", this.getClass());
    }

    public boolean getEncodeURL() {
        throw new NotImplementedException("getEncodeURL", this.getClass());
    }

    public void setURLSessionIdSpecifier(String specifier) {
        throw new NotImplementedException("setURLSessionIdSpecifier", this.getClass());
    }

    public String getURLSessionIdSpecifier() {
        throw new NotImplementedException("getURLSessionIdSpecifier", this.getClass());
    }

    public void setRestorableSessionIdFromURL(String id) {
        throw new NotImplementedException("setRestorableSessionIdFromURL", this.getClass());
    }

    public String getRestorableSessionIdFromURL() {
        throw new NotImplementedException("getRestorableSessionIdFromURL", this.getClass());
    }

    public void setWebApplication(WebApplicationInterface app) {
        throw new NotImplementedException("setWebApplication", this.getClass());
    }

    public void setRedirectURLValidator(RedirectURLValidator validator) {
        throw new NotImplementedException("setRedirectURLValidator", this.getClass());
    }

    public RedirectURLValidator getRedirectURLValidator() {
        throw new NotImplementedException("getRedirectURLValidator", this.getClass());
    }

    public boolean isLoggingInfo() {
        throw new NotImplementedException("isLoggingInfo", this.getClass());
    }

    public void setLoggingInfo(boolean logging) {
        throw new NotImplementedException("setLoggingInfo", this.getClass());
    }

    public boolean isLoggingWarning() {
        throw new NotImplementedException("isLoggingWarning", this.getClass());
    }

    public void setLoggingWarning(boolean logging) {
        throw new NotImplementedException("setLoggingWarning", this.getClass());
    }

    public boolean isLoggingError() {
        throw new NotImplementedException("isLoggingError", this.getClass());
    }

    public void setLoggingError(boolean logging) {
        throw new NotImplementedException("setLoggingError", this.getClass());
    }

    public boolean isLoggingDebug() {
        throw new NotImplementedException("isLoggingDebug", this.getClass());
    }

    public void setLoggingDebug(boolean logging) {
        throw new NotImplementedException("setLoggingDebug", this.getClass());
    }

    public void logInfo(String message) {
        throw new NotImplementedException("logInfo", this.getClass());
    }

    public void logInfo(Throwable t) {
        throw new NotImplementedException("logInfo", this.getClass());
    }

    public void logInfo(String message, Throwable t) {
        throw new NotImplementedException("logInfo", this.getClass());
    }

    public void logWarning(String message) {
        throw new NotImplementedException("logWarning", this.getClass());
    }

    public void logWarning(Throwable t) {
        throw new NotImplementedException("logWarning", this.getClass());
    }

    public void logWarning(String message, Throwable t) {
        throw new NotImplementedException("logWarning", this.getClass());
    }

    public void logError(String message) {
        throw new NotImplementedException("logError", this.getClass());
    }

    public void logError(Throwable t) {
        throw new NotImplementedException("logError", this.getClass());
    }

    public void logError(String message, Throwable t) {
        throw new NotImplementedException("logError", this.getClass());
    }

    public void logDebug(String message) {
        throw new NotImplementedException("logDebug", this.getClass());
    }

    public void logDebug(Throwable t) {
        throw new NotImplementedException("logDebug", this.getClass());
    }

    public void logDebug(String message, Throwable t) {
        throw new NotImplementedException("logDebug", this.getClass());
    }

    public void printRequest(PrintStream out) {
        throw new NotImplementedException("printRequest", this.getClass());
    }

    public void pushFrame() {
        throw new NotImplementedException("pushFrame", this.getClass());
    }

    public void popFrame() {
        throw new NotImplementedException("popFrame", this.getClass());
    }

    public int getCountOfFrames() {
        throw new NotImplementedException("getCountOfFrames", this.getClass());
    }

    public void pushParameters(Dictionary dic) {
        throw new NotImplementedException("pushParameters", this.getClass());
    }

    public void pushDefaultParameters(Dictionary dic) {
        throw new NotImplementedException("pushDefaultParameters", this.getClass());
    }

    public void popDefaultParameters() {
        throw new NotImplementedException("popDefaultParameters", this.getClass());
    }

    public void popParameters() {
        throw new NotImplementedException("popParameters", this.getClass());
    }

    public Map getMapForCurrentFrame() {
        throw new NotImplementedException("getMapForCurrentFrame", this.getClass());
    }

    public Map getMapCopyOfCurrentFrame() {
        throw new NotImplementedException("getMapCopyOfCurrentFrame", this.getClass());
    }

    public Map getCurrentFrameWithoutNulls(boolean copy) {
        throw new NotImplementedException("getCurrentFrameWithoutNulls", this.getClass());
    }

    public void setBaseDirectory(String dir) {
        throw new NotImplementedException("setBaseDirectory", this.getClass());
    }

    public String getBaseDirectory() {
        throw new NotImplementedException("getBaseDirectory", this.getClass());
    }

    public void setParameter(String name, Object val) {
        throw new NotImplementedException("setParameter", this.getClass());
    }

    public void setParameter(String name, Object val, TagConverter converter, Properties props) throws ServletException {
        throw new NotImplementedException("setParameter", this.getClass());
    }

    public Object removeParameter(String name) {
        throw new NotImplementedException("removeParameter", this.getClass());
    }

    public Object resolveGlobalName(ComponentName name) {
        throw new NotImplementedException("resolveGlobalName", this.getClass());
    }

    public Object resolveSessionName(ComponentName name) {
        throw new NotImplementedException("resolveSessionName", this.getClass());
    }

    public Object resolveRequestName(ComponentName name) {
        throw new NotImplementedException("resolveRequestName", this.getClass());
    }

    public Object resolveName(ComponentName name) {
        throw new NotImplementedException("resolveName", this.getClass());
    }

    public Object resolveName(ComponentName name, boolean create) {
        throw new NotImplementedException("resolveName", this.getClass());
    }

    public ComponentName getContextNamePath() {
        throw new NotImplementedException("getContextNamePath", this.getClass());
    }

    public Object resolveGlobalName(String name) {
        throw new NotImplementedException("resolveGlobalName", this.getClass());
    }

    public Object resolveSessionName(String name) {
        throw new NotImplementedException("resolveSessionName", this.getClass());
    }

    public Object resolveRequestName(String name) {
        throw new NotImplementedException("resolveRequestName", this.getClass());
    }

    public Object resolveName(String name) {
        throw new NotImplementedException("resolveName", this.getClass());
    }

    public Object resolveName(String name, boolean create) {
        throw new NotImplementedException("resolveName", this.getClass());
    }

    public String getParameter(ParameterName name) {
        throw new NotImplementedException("getParameter", this.getClass());
    }

    public Object getLocalParameter(ParameterName name) {
        throw new NotImplementedException("getLocalParameter", this.getClass());
    }

    public Object getObjectParameter(ParameterName name) {
        throw new NotImplementedException("getObjectParameter", this.getClass());
    }

    public boolean serviceParameter(ParameterName name, ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new NotImplementedException("serviceParameter", this.getClass());
    }

    public boolean serviceParameter(ParameterName name, ServletRequest req, ServletResponse res, TagConverter converter, Properties props) throws ServletException, IOException {
        throw new NotImplementedException("serviceParameter", this.getClass());
    }

    public boolean serviceLocalParameter(ParameterName name, ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new NotImplementedException("serviceLocalParameter", this.getClass());
    }

    public Object getObjectParameter(String name) {
        throw new NotImplementedException("getObjectParameter", this.getClass());
    }

    public String getParameter(String name) {
        throw new NotImplementedException("getParameter", this.getClass());
    }

    public Object getLocalParameter(String name) {
        throw new NotImplementedException("getLocalParameter", this.getClass());
    }

    public String[] getParameterValues(String name) {
        throw new NotImplementedException("getParameterValues", this.getClass());
    }

    public Enumeration getParameterNames() {
        throw new NotImplementedException("getParameterNames", this.getClass());
    }

    public boolean serviceParameter(String name, ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new NotImplementedException("serviceParameter", this.getClass());
    }

    public boolean serviceParameter(String name, ServletRequest req, ServletResponse res, TagConverter converter, Properties props) throws ServletException, IOException {
        throw new NotImplementedException("serviceParameter", this.getClass());
    }

    public boolean serviceLocalParameter(String name, ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new NotImplementedException("serviceLocalParameter", this.getClass());
    }

    public String getRealPath(String path) {
        throw new NotImplementedException("getRealPath", this.getClass());
    }

    public void setDocRootServicePrefix(String prefix) {
        throw new NotImplementedException("setDocRootServicePrefix", this.getClass());
    }

    public String getDocRootServicePrefix() {
        throw new NotImplementedException("getDocRootServicePrefix", this.getClass());
    }

    public Cookie[] getCookies() {
        throw new NotImplementedException("getCookies", this.getClass());
    }

    public HttpSession getSession(boolean create) {
        throw new NotImplementedException("getSession", this.getClass());
    }

    public HttpSession getSession() {
        throw new NotImplementedException("getSession", this.getClass());
    }

    public String getRequestedSessionId() {
        throw new NotImplementedException("getRequestedSessionId", this.getClass());
    }

    public boolean isRequestedSessionIdValid() {
        throw new NotImplementedException("isRequestedSessionIdValid", this.getClass());
    }

    public boolean isRequestedSessionIdFromCookie() {
        throw new NotImplementedException("isRequestedSessionIdFromCookie", this.getClass());
    }

    public boolean isRequestedSessionIdFromUrl() {
        throw new NotImplementedException("isRequestedSessionIdFromUrl", this.getClass());
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        throw new NotImplementedException("getRequestDispatcher", this.getClass());
    }

    public RequestDispatcher getRequestDispatcher(ServletContext context, String path) {
        throw new NotImplementedException("getRequestDispatcher", this.getClass());
    }

    public void setEventFlags(int eventFlags) {
        throw new NotImplementedException("setEventFlags", this.getClass());
    }

    public int getEventFlags() {
        throw new NotImplementedException("getEventFlags", this.getClass());
    }

    public void setDisableExitTracking(boolean disableExitTracking) {
        throw new NotImplementedException("setDisableExitTracking", this.getClass());
    }

    public boolean getDisableExitTracking() {
        throw new NotImplementedException("getDisableExitTracking", this.getClass());
    }

    public void setupLoopbackTemplateEmailRequest() {
        throw new NotImplementedException("setupLoopbackTemplateEmailRequest", this.getClass());
    }

    public void setInTemplatePage(boolean inPage) {
        throw new NotImplementedException("setInTemplatePage", this.getClass());
    }

    public boolean isInTemplatePage() {
        throw new NotImplementedException("isInTemplatePage", this.getClass());
    }

    public void setFormEventsSent(boolean eventsSent) {
        throw new NotImplementedException("setFormEventsSent", this.getClass());
    }

    public boolean getFormEventsSent() {
        throw new NotImplementedException("getFormEventsSent", this.getClass());
    }

    public void setRequestURIHasQueryString(boolean hasQueryString) {
        throw new NotImplementedException("setRequestURIHasQueryString", this.getClass());
    }

    public ServletRequestWrapper getWrapper() {
        throw new NotImplementedException("getWrapper", this.getClass());
    }

    public void setWrapper(ServletRequestWrapper wrapper) {
        throw new NotImplementedException("setWrapper", this.getClass());
    }

    public boolean isUserInRole(String role) {
        throw new NotImplementedException("isUserInRole", this.getClass());
    }

    public Principal getUserPrincipal() {
        throw new NotImplementedException("getUserPrincipal", this.getClass());
    }

    public void setDynamoPipeline(boolean pipeline) {
        throw new NotImplementedException("setDynamoPipeline", this.getClass());
    }

    public boolean isDynamoPipeline() {
        throw new NotImplementedException("isDynamoPipeline", this.getClass());
    }

    public void setAfterGetsClaimed(boolean after) {
        throw new NotImplementedException("setAfterGetsClaimed", this.getClass());
    }

    public boolean isAfterGetsClaimed() {
        throw new NotImplementedException("isAfterGetsClaimed", this.getClass());
    }

    public ResolveNameHelper getResolveNameHelper() {
        throw new NotImplementedException("getResolveNameHelper", this.getClass());
    }

    public void setResolveNameHelper(ResolveNameHelper helper) {
        throw new NotImplementedException("setResolveNameHelper", this.getClass());
    }

    public ResolveNameHelper getMultiNucleusResolveNameHelper() {
        throw new NotImplementedException("getMultiNucleusResolveNameHelper", this.getClass());
    }

    public Map getParamMapForTopFrame() {
        throw new NotImplementedException("getParamMapForTopFrame", this.getClass());
    }

    public NameContext getSessionNameContext() {
        throw new NotImplementedException("getSessionNameContext", this.getClass());
    }

    public long getSessionConfirmationNumber() {
        throw new NotImplementedException("getSessionConfirmationNumber", this.getClass());
    }
}
