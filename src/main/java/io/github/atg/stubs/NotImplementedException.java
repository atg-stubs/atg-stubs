package io.github.atg.stubs;

public class NotImplementedException extends RuntimeException {

    public NotImplementedException(String method, Class<?> clazz){
        super("The method " + method + " for class " + clazz.getSimpleName() + " is just a stub from atg-stubs and you should not be calling it");
    }
}
