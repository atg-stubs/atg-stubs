package atg.nucleus.logging;

public interface ApplicationLogging {

    /**
     * @return true if this is currently logging debug messages, false if it is not
     */
    boolean isLoggingDebug();


    void setLoggingDebug(boolean logDebug);

    void logDebug(String msg);

    void logDebug(Throwable throwable);

    void logDebug(String msg, Throwable throwable);


    /**
     * @return true if this is currently logging info messages, false if it is not
     */
    boolean isLoggingInfo();

    void setLoggingInfo(boolean logInfo);

    void logInfo(String msg);

    void logInfo(Throwable throwable);

    void logInfo(String msg, Throwable throwable);



    /**
     * @return true if this is currently logging warning messages, false if it is not
     */
    boolean isLoggingWarning();

    void setLoggingWarning(boolean logWarn);

    void logWarning(String msg);

    void logWarning(Throwable throwable);

    void logWarning(String msg, Throwable throwable);


    /**
     * @return true if this is currently logging error messages, false if it is not
     */
    boolean isLoggingError();

    void setLoggingError(boolean logError);

    void logError(String msg);

    void logError(Throwable throwable);

    void logError(String msg, Throwable throwable);




}
